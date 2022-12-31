package org.sohagroup.ir.service.impl;

import static org.sohagroup.ir.config.Constants.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sohagroup.ir.config.Constants;
import org.sohagroup.ir.service.AssetService;
import org.sohagroup.ir.service.dto.*;
import org.sohagroup.ir.web.rest.model.response.*;
import org.sohagroup.ir.web.rest.model.response.AssetTokenResponse;
import org.sohagroup.ir.web.rest.model.response.ViewAssetResponse;
import org.sohagroup.ir.web.rest.request.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;
import reactor.core.publisher.Mono;

@Service
public class AssetServiceImpl implements AssetService {

    private final Logger log = LoggerFactory.getLogger(AssetServiceImpl.class);
    private final ObjectMapper objectMapper;
    private final WebClient webClient;
    Map<String, Object> token = new HashMap<>();

    @Value("${uri.baseUri}")
    public String baseUri;

    @Value("${uri.port}")
    public String port;

    @Value("${token.userName}")
    public String userName;

    @Value("${token.password}")
    public String password;

    @Value("${token.grantType}")
    public String grantType;

    @Value("${token.clientId}")
    public String clientId;

    public AssetServiceImpl(WebClient webClient, ObjectMapper objectMapper) {
        this.webClient = webClient;
        this.objectMapper = objectMapper;
        this.objectMapper.findAndRegisterModules();
    }

    /**
     * this method use to get token from server
     * after get new token save many property intro map for used other methods
     *
     * @return response according to document
     */

    @Override
    public AssetTokenResponseDTO getToken() {
        String tokenResponse;
        log.info("token details receive in resource with {} userName", userName);
        AssetTokenResponseDTO assetTokenResponseDTO = new AssetTokenResponseDTO();
        try {
            tokenResponse =
                webClient
                    .post()
                    .uri(uriBuilder -> uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(Constants.TOKEN).build())
                    .accept(MediaType.APPLICATION_FORM_URLENCODED)
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                    .body(
                        BodyInserters
                            .fromFormData(USERNAME_EQUAL, userName)
                            .with(PASSWORD_EQUAL, password)
                            .with(GRANT_TYPE, grantType)
                            .with(CLIENT_ID, clientId)
                    )
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            assetTokenResponseDTO.setAssetTokenResponse(objectMapper.readValue(tokenResponse, AssetTokenResponse.class));
            log.info(
                "getToken has complete from webClient your token expired at {}:",
                assetTokenResponseDTO.getAssetTokenResponse().getExpiredTime()
            );
            token.put(ACCESS_TOKEN, assetTokenResponseDTO.getAssetTokenResponse().getAccessToken());
            token.put(ACCESS_TOKEN_ID, assetTokenResponseDTO.getAssetTokenResponse().getTokenId());
            token.put(USER_ID, assetTokenResponseDTO.getAssetTokenResponse().getUserId());
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return assetTokenResponseDTO;
    }

    /**
     * get list of viewAssets in this method happen one map variable
     * userId and search are required but other variables are optional
     * userId and accessToken after run this method are set in map of Token
     *
     * @param assetInput
     * @return ViewAssetResponseDTO
     */

    @Override
    public ViewAssetResponse getViewAssetList(Map<String, String> assetInput) {
        log.info("viewAssetList details receive in service with target search {}", assetInput.get("search"));
        ViewAssetResponse viewAssetResponse = new ViewAssetResponse();
        String response;
        try {
            response =
                webClient
                    .get()
                    .uri(uriBuilder -> {
                        uriBuilder
                            .scheme(URI_SCHEME)
                            .host(baseUri)
                            .port(port)
                            .path(ASSET_PATH)
                            .queryParam(SEARCH_EQUAL, assetInput.get(SEARCH_EQUAL))
                            .queryParam(USER_ID, token.get(USER_ID));
                        for (String key : assetInput.keySet()) {
                            uriBuilder.queryParam(key, assetInput.get(key));
                        }
                        return uriBuilder.build();
                    })
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, BEARER + token.get(ACCESS_TOKEN))
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            log.info("getViewAssetList receive in service with this response {}", response);
            viewAssetResponse = objectMapper.readValue(response, ViewAssetResponse.class);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.valueOf(viewAssetResponse.getMessageCode())).withDetail(e.getMessage()).build();
        }
        return viewAssetResponse;
    }

    /**
     * update asset status(Reserve/UnReserve in Doc) on this method happen
     * userId and accessTokenId and accessToken set to map Token in getToken method
     *
     * @param updateAssetStatusModel
     * @return UpdateAssetStatusResponseDTO
     */
    @Override
    public UpdateAssetStatusResponseDTO updateAssetStatus(UpdateAssetStatusRequest updateAssetStatusModel) {
        log.info("updateAssetStatus details receive in service with this assetCode {}", updateAssetStatusModel.getAssetCode());
        UpdateAssetStatusResponseDTO updateAssetStatusResponse = new UpdateAssetStatusResponseDTO();
        updateAssetStatusModel.setUserId(token.get(USER_ID).toString());
        String updateAssetResponse;
        try {
            updateAssetResponse =
                webClient
                    .post()
                    .uri(uriBuilder ->
                        uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(Constants.ASSET_UPDATE_PATH).build()
                    )
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(ACCESS_TOKEN))
                    .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                    .body(Mono.just(updateAssetStatusModel), UpdateAssetStatusRequest.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            updateAssetStatusResponse.setUpdateAssetStatusResponse(
                objectMapper.readValue(updateAssetResponse, UpdateAssetStatusResponse.class)
            );
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return updateAssetStatusResponse;
    }

    @Override
    public Mono<LocationsResponseDTO> getLocations(Integer maxResponseId, Integer offset) {
        log.info("locations details receive in service with");
        try {
            return webClient
                .get()
                .uri(uriBuilder ->
                    uriBuilder
                        .scheme(URI_SCHEME)
                        .host(baseUri)
                        .port(port)
                        .path(ASSET_LOCATION_PATH)
                        .queryParam(Constants.USER_ID, token.get(USER_ID))
                        .queryParam(Constants.MAX_RESPONSE_ID, maxResponseId)
                        .queryParamIfPresent(Constants.OFFSET, Optional.ofNullable(offset))
                        .build()
                )
                .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(ACCESS_TOKEN))
                .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(LocationsResponseDTO.class);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
    }

    /**
     *
     * @param linkAssetModel
     * @return
     */

    @Override
    public LinkAssetResponseDTO linkAsset(LinkAssetRequest linkAssetModel) {
        log.info("linkAsset details receive in service ");
        linkAssetModel.setUserId(token.get(USER_ID).toString());
        LinkAssetResponseDTO linkAssetResponseDTO;
        try {
            linkAssetResponseDTO =
                webClient
                    .post()
                    .uri(uriBuilder ->
                        uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(Constants.LINK_ASSET_PATH).build()
                    )
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(Constants.ACCESS_TOKEN))
                    .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                    .body(Mono.just(linkAssetModel), LinkAssetRequest.class)
                    .retrieve()
                    .bodyToMono(LinkAssetResponseDTO.class)
                    .block();

            log.info("linkAsset receive in service with this response {}", linkAssetResponseDTO);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return linkAssetResponseDTO;
    }

    /**
     * declare RoundUp method in assetInstallation
     * many of inputs from token import from map of token details
     *
     * @param assetInstallationModel
     * @return AssetInstallationResponse
     */
    @Override
    public AssetInstallationResponse assetInstallation(AgentCollectionRequest assetInstallationModel) {
        log.info("assetInstallation details receive in service with this assetCode {}", assetInstallationModel.getAssetCode());
        AssetInstallationResponse assetInstallationResponse;
        assetInstallationModel.setUserId(token.get(USER_ID).toString());
        String assetInstallation;
        try {
            assetInstallation =
                webClient
                    .post()
                    .uri(uriBuilder ->
                        uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(ASSET_INSTALLATION_PATH).build()
                    )
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(ACCESS_TOKEN))
                    .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                    .body(Mono.just(assetInstallationModel), AssetInstallationResponse.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            assetInstallationResponse = objectMapper.readValue(assetInstallation, AssetInstallationResponse.class);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return assetInstallationResponse;
    }

    /**
     * declare supportTicketConfirmation method
     * many of inputs from token import from map of token details
     *
     * @param supportTicketConfirmationModel
     * @return SupportTicketConfirmationResponse
     */
    @Override
    public SupportTicketConfirmationResponse supportTicketConfirmation(SupportTicketConfirmationRequest supportTicketConfirmationModel) {
        log.info(
            "supportTicketConfirmation details receive in service with this assetCode {}",
            supportTicketConfirmationModel.getAssetCode()
        );
        SupportTicketConfirmationResponse supportTicketConfirmationResponse;
        supportTicketConfirmationModel.setUserId(token.get(USER_ID).toString());
        String supportAssetResponse;
        try {
            supportAssetResponse =
                webClient
                    .post()
                    .uri(uriBuilder -> uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(SUPPORT_ASSET_PATH).build())
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(ACCESS_TOKEN))
                    .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                    .body(Mono.just(supportTicketConfirmationModel), SupportTicketConfirmationRequest.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            log.info("supportTicketConfirmation receive in service with this response {}", supportAssetResponse);
            supportTicketConfirmationResponse = objectMapper.readValue(supportAssetResponse, SupportTicketConfirmationResponse.class);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return supportTicketConfirmationResponse;
    }

    /**
     * declare transferIp method
     * many of inputs from token import from map of token details
     *
     * @param transferIpRequestModel
     * @return TransferIpResponseDTO
     */
    @Override
    public TransferIpResponseDTO transferIp(TransferIpRequestDTO transferIpRequestModel) {
        log.info("transferIp details receive in service with this locationId {}", transferIpRequestModel.getLocationId());
        TransferIpResponseDTO transferIpResponseDTO = new TransferIpResponseDTO();
        transferIpRequestModel.setUserId(token.get(USER_ID).toString());
        String transferIpResponse;
        try {
            transferIpResponse =
                webClient
                    .post()
                    .uri(uriBuilder ->
                        uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(Constants.ASSET_TRANSFER_IP_PATH).build()
                    )
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(Constants.ACCESS_TOKEN))
                    .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                    .body(Mono.just(transferIpRequestModel), TransferIpRequestDTO.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            log.info("transferIp receive in service with this response {}", transferIpResponse);
            transferIpResponseDTO.setTransferIpResponse(objectMapper.readValue(transferIpResponse, TransferIpResponse.class));
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return transferIpResponseDTO;
    }

    /**
     * declare Installation-Check Agent Credit method in getAgentCredit
     * many of inputs from token import from map of token details
     *
     * @param agentCode
     * @return AgentCreditResponse
     */
    @Override
    public AgentCreditResponse getAgentCredit(String agentCode) {
        log.info("agentCredit details receive in service with this agentCode {}", agentCode);
        AgentCreditResponse agentCreditResponse;
        String response;
        try {
            response =
                webClient
                    .get()
                    .uri(uriBuilder ->
                        uriBuilder
                            .scheme(Constants.URI_SCHEME)
                            .host(baseUri)
                            .port(port)
                            .path(Constants.AGENT_CREDIT_PATH)
                            .queryParam(Constants.USER_ID, token.get(Constants.USER_ID))
                            .queryParam(Constants.AGENT_CODE_EQUAL, agentCode)
                            .build()
                    )
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(Constants.ACCESS_TOKEN))
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            log.info("agentCredit webclient receive in this response {}", response);
            agentCreditResponse = objectMapper.readValue(response, AgentCreditResponse.class);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return agentCreditResponse;
    }

    /**
     * declare Installation -Update Customer Details method in agentCollection
     * many of inputs from token import from map of token details
     *
     * @param updateCustomerRequestModel
     * @return UpdateCustomerResponse
     */
    @Override
    public UpdateCustomerResponse agentCollection(UpdateCustomerRequestDTO updateCustomerRequestModel) {
        log.info("agentCollection details receive in service with this assetCode {}", updateCustomerRequestModel.getAssetCode());
        UpdateCustomerResponse updateCustomerResponse;
        updateCustomerRequestModel.setUserId(token.get(USER_ID).toString());
        String agentCollectionResponse;
        try {
            agentCollectionResponse =
                webClient
                    .post()
                    .uri(uriBuilder ->
                        uriBuilder.scheme(Constants.URI_SCHEME).host(baseUri).port(port).path(ASSET_INSTALLATION_PATH).build()
                    )
                    .accept(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, Constants.BEARER + token.get(ACCESS_TOKEN))
                    .header(Constants.TOKEN_ED, token.get(Constants.ACCESS_TOKEN_ID).toString())
                    .body(Mono.just(updateCustomerRequestModel), UpdateCustomerRequestDTO.class)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();
            log.info("transferIp receive in service with this response {}", agentCollectionResponse);
            updateCustomerResponse = objectMapper.readValue(agentCollectionResponse, UpdateCustomerResponse.class);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_SERVICE, e.getMessage(), e);
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return updateCustomerResponse;
    }
}
