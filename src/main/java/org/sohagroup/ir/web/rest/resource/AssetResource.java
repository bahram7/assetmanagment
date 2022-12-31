package org.sohagroup.ir.web.rest.resource;

import static org.sohagroup.ir.config.Constants.*;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sohagroup.ir.service.AssetService;
import org.sohagroup.ir.web.rest.api.AssetApi;
import org.sohagroup.ir.web.rest.model.response.*;
import org.sohagroup.ir.web.rest.request.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;
import reactor.core.publisher.Mono;

@Service
@RestController
public class AssetResource implements AssetApi {

    @Value("${token.userName}")
    public String tokenUserName;

    private final AssetService assetService;
    private final Logger log = LoggerFactory.getLogger(AssetResource.class);

    public AssetResource(AssetService assetService) {
        this.assetService = assetService;
    }

    @Override
    public ResponseEntity<AssetTokenResponseDTO> getToken() {
        log.info("token details receive in resource with {} userName", tokenUserName);
        AssetTokenResponseDTO assetTokenResponseDTO = new AssetTokenResponseDTO();
        try {
            assetTokenResponseDTO = assetService.getToken();
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(assetTokenResponseDTO);
    }

    /**
     * @param appName
     * @param token
     * @param search
     * @param AssetCode
     * @param AssetName
     * @param CategoryCode
     * @param CategoryName
     * @param LocationName
     * @param Serial
     * @param Status
     * @param Brand
     * @param LinkedAsset
     * @param IMEI
     * @param IMSI
     * @param ICCID
     * @return
     */

    @Override
    public ResponseEntity<ViewAssetResponseDTO> getViewAssetList(
        String appName,
        String token,
        String search,
        String AssetCode,
        String AssetName,
        String CategoryCode,
        String CategoryName,
        String LocationName,
        String Serial,
        String Status,
        String Brand,
        String LinkedAsset,
        String IMEI,
        String IMSI,
        String ICCID
    ) {
        log.info("viewAssetList receive in resource target search is {}:", search);
        Map<String, String> assetInput = new HashMap<>();
        assetInput.put(MAP_SEARCH, search);
        if (AssetCode != null) {
            assetInput.put(MAP_ASSET_CODE, AssetCode);
        }
        if (AssetName != null) {
            assetInput.put(MAP_ASSET_NAME, AssetName);
        }
        if (CategoryCode != null) {
            assetInput.put(MAP_CATEGORY_CODE, CategoryCode);
        }
        if (CategoryName != null) {
            assetInput.put(MAP_CATEGORY_NAME, CategoryName);
        }
        if (LocationName != null) {
            assetInput.put(MAP_LOCATION_NAME, LocationName);
        }
        if (Serial != null) {
            assetInput.put(MAP_SERIAL, Serial);
        }
        if (Status != null) {
            assetInput.put(MAP_STATUS, Status);
        }
        if (Brand != null) {
            assetInput.put(MAP_BRAND, Brand);
        }
        if (LinkedAsset != null) {
            assetInput.put(MAP_LINKED_ASSET, LinkedAsset);
        }
        if (IMEI != null) {
            assetInput.put(MAP_IEMI, IMEI);
        }
        if (IMSI != null) {
            assetInput.put(MAP_IMSI, IMSI);
        }
        if (ICCID != null) {
            assetInput.put(MAP_ICCID, ICCID);
        }
        ViewAssetResponseDTO viewAssetResponse = new ViewAssetResponseDTO();
        try {
            viewAssetResponse.setViewAssetResponse(assetService.getViewAssetList(assetInput));
            if (viewAssetResponse.getViewAssetResponse().getMessageCode() == 34) {
                viewAssetResponse.setStatusCode(org.zalando.problem.Status.OK.getStatusCode());
                viewAssetResponse.setStatusMessage(org.zalando.problem.Status.OK.getReasonPhrase());
            } else if (viewAssetResponse.getViewAssetResponse().getMessageCode() == 140) {
                viewAssetResponse.setStatusCode(org.zalando.problem.Status.BAD_REQUEST.getStatusCode());
                viewAssetResponse.setStatusMessage(ASSET_LIST_EXCEPTION_VALUE);
            }
            log.info("viewAsset details receive from service response is: {}", viewAssetResponse);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            viewAssetResponse.setStatusCode(org.zalando.problem.Status.BAD_REQUEST.getStatusCode());
            viewAssetResponse.setStatusMessage(org.zalando.problem.Status.BAD_REQUEST.getReasonPhrase());
            throw Problem.builder().withStatus(org.zalando.problem.Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(viewAssetResponse.getStatusCode()).body(viewAssetResponse);
    }

    /**
     * implement Reserve/UnReserve from this method with updateAssetStatusModel
     * userId become after getToken from hashmap variable
     *
     * @param updateAssetStatusModel
     * @return ResponseEntity
     */
    @Override
    public ResponseEntity<UpdateAssetStatusResponseDTO> updateAssetStatus(
        String appName,
        String token,
        UpdateAssetStatusRequest updateAssetStatusModel
    ) {
        log.info("updateAsset details receive in resource with this status {}:", updateAssetStatusModel.getStatus());
        UpdateAssetStatusResponseDTO updateAssetStatusResponse = new UpdateAssetStatusResponseDTO();
        try {
            updateAssetStatusResponse = assetService.updateAssetStatus(updateAssetStatusModel);
            log.info("updateAssetStatus details receive from service response is: {}", updateAssetStatusResponse);
            if (updateAssetStatusResponse.getUpdateAssetStatusResponse().getMessage() == 34) {
                updateAssetStatusResponse.setStatusCode(Status.OK.getStatusCode());
                updateAssetStatusResponse.setStatusMessage(Status.OK.getReasonPhrase());
            } else {
                updateAssetStatusResponse.setStatusCode(Status.PRECONDITION_FAILED.getStatusCode());
                updateAssetStatusResponse.setStatusMessage(Status.PRECONDITION_FAILED.getReasonPhrase());
            }
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            updateAssetStatusResponse.setStatusCode(Status.BAD_GATEWAY.getStatusCode());
            updateAssetStatusResponse.setStatusMessage(Status.BAD_GATEWAY.getReasonPhrase());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(updateAssetStatusResponse.getStatusCode()).body(updateAssetStatusResponse);
    }

    /**
     * declare Installation-Check Agent Credit method in getAgentCredit
     * userId become after getToken from hashmap variable
     *
     * @param agentCode
     * @return AgentCreditResponseDTO
     */
    @Override
    public ResponseEntity<AgentCreditResponseDTO> agentCredit(String appName, String token, String agentCode) {
        log.info("agentCredit details receive in resource with this agentCode {}:", agentCode);
        AgentCreditResponseDTO agentCreditResponseDTO = new AgentCreditResponseDTO();
        try {
            agentCreditResponseDTO.setAgentCreditResponse(assetService.getAgentCredit(agentCode));
            log.info("agentCredit response from service {}:", agentCreditResponseDTO.getAgentCreditResponse());
            if (agentCreditResponseDTO.getAgentCreditResponse().getMessage() == 34) {
                agentCreditResponseDTO.setStatusCode(Status.OK.getStatusCode());
                agentCreditResponseDTO.setStatusMessage(Status.OK.getReasonPhrase());
            } else {
                agentCreditResponseDTO.setStatusCode(Status.PRECONDITION_FAILED.getStatusCode());
                agentCreditResponseDTO.setStatusMessage(Status.PRECONDITION_FAILED.getReasonPhrase());
            }
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            agentCreditResponseDTO.setStatusCode(Status.BAD_REQUEST.getStatusCode());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(agentCreditResponseDTO.getStatusCode()).body(agentCreditResponseDTO);
    }

    /**
     * declare RoundUp method in assetInstallation
     * userId become after getToken from hashmap variable
     *
     * @param assetInstallationModel
     * @return AssetInstallationResponse
     */
    @Override
    public ResponseEntity<AgentCollectionResponseDTO> agentCollection(
        String appName,
        String token,
        AgentCollectionRequest assetInstallationModel
    ) {
        log.info("assetInstallation details receive in resource with this status {}:", assetInstallationModel.getStatus());
        AgentCollectionResponseDTO assetInstallationResponse = new AgentCollectionResponseDTO();
        try {
            assetInstallationResponse.setAssetInstallationResponse(assetService.assetInstallation(assetInstallationModel));
            log.info("assetInstallation details receive from service with this status {}:", assetInstallationModel.getStatus());
            if (assetInstallationResponse.getAssetInstallationResponse().getMessage() == 34) {
                assetInstallationResponse.setStatusCode(Status.OK.getStatusCode());
                assetInstallationResponse.setStatusMessage(Status.OK.getReasonPhrase());
            } else {
                assetInstallationResponse.setStatusCode(Status.PRECONDITION_FAILED.getStatusCode());
                assetInstallationResponse.setStatusMessage(Status.PRECONDITION_FAILED.getReasonPhrase());
            }
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            assetInstallationResponse.setStatusCode(Status.BAD_REQUEST.getStatusCode());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(assetInstallationResponse.getStatusCode()).body(assetInstallationResponse);
    }

    /**
     * declare Installation -Update Customer Details method in agentCollection
     * userId become after getToken from hashmap variable
     *
     * @param updateCustomerRequestModel
     * @return UpdateCustomerResponseDTO
     */
    public ResponseEntity<UpdateCustomerResponseDTO> updateCustomer(
        String appName,
        String token,
        UpdateCustomerRequestDTO updateCustomerRequestModel
    ) {
        log.info("agentCollection details receive in resource with this assetCode {}:", updateCustomerRequestModel.getAssetCode());
        UpdateCustomerResponseDTO updateCustomerResponse = new UpdateCustomerResponseDTO();
        try {
            updateCustomerResponse.setUpdateCustomerResponse(assetService.agentCollection(updateCustomerRequestModel));
            log.info("agentCollection response from service {}:", updateCustomerResponse.getUpdateCustomerResponse());
            if (updateCustomerResponse.getUpdateCustomerResponse().getMessage() == 34) {
                updateCustomerResponse.setStatusCode(Status.OK.getStatusCode());
                updateCustomerResponse.setStatusMessage(Status.OK.getReasonPhrase());
            } else {
                updateCustomerResponse.setStatusCode(Status.PRECONDITION_FAILED.getStatusCode());
                updateCustomerResponse.setStatusMessage(Status.PRECONDITION_FAILED.getReasonPhrase());
            }
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            updateCustomerResponse.setStatusCode(Status.BAD_REQUEST.getStatusCode());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(updateCustomerResponse.getStatusCode()).body(updateCustomerResponse);
    }

    /**
     * declare supportAssetStatus
     * userId become after getToken from hashmap variable
     *
     * @param supportTicketConfirmationModel
     * @return SupportTicketConfirmationResponseDTO
     */
    @Override
    public ResponseEntity<SupportTicketConfirmationResponseDTO> supportTicketConfirmation(
        String appName,
        String token,
        SupportTicketConfirmationRequest supportTicketConfirmationModel
    ) {
        SupportTicketConfirmationResponseDTO supportTicketConfirmationResponse = new SupportTicketConfirmationResponseDTO();
        log.info("assetInstallation details receive in resource with this status {}:", supportTicketConfirmationModel);
        try {
            supportTicketConfirmationResponse.setSupportTicketConfirmationResponse(
                assetService.supportTicketConfirmation(supportTicketConfirmationModel)
            );
            if (supportTicketConfirmationResponse.getSupportTicketConfirmationResponse().getMessage() == 34) {
                supportTicketConfirmationResponse.setStatusCode(Status.OK.getStatusCode());
                supportTicketConfirmationResponse.setStatusMessage(Status.OK.getReasonPhrase());
            } else {
                supportTicketConfirmationResponse.setStatusCode(Status.PRECONDITION_FAILED.getStatusCode());
                supportTicketConfirmationResponse.setStatusMessage(Status.PRECONDITION_FAILED.getReasonPhrase());
            }
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            supportTicketConfirmationResponse.setStatusCode(Status.BAD_REQUEST.getStatusCode());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(supportTicketConfirmationResponse.getStatusCode()).body(supportTicketConfirmationResponse);
    }

    /**
     * declare TransferIp method
     * userId become after getToken from hashmap variable
     *
     * @param transferIpRequestModel
     * @return TransferIpResponseDTO
     */
    @Override
    public ResponseEntity<TransferIpResponseDTO> transferIp(String appName, String token, TransferIpRequestDTO transferIpRequestModel) {
        TransferIpResponseDTO transferIpResponse = new TransferIpResponseDTO();
        try {
            transferIpResponse = assetService.transferIp(transferIpRequestModel);
            log.info("transferIp details receive from service response is: {}", transferIpResponse);
            if (transferIpResponse.getTransferIpResponse().getMessage() == 34) {
                transferIpResponse.setStatusCode(Status.OK.getStatusCode());
                transferIpResponse.setStatusMessage(Status.OK.getReasonPhrase());
            } else {
                transferIpResponse.setStatusCode(Status.PRECONDITION_FAILED.getStatusCode());
                transferIpResponse.setStatusMessage(Status.PRECONDITION_FAILED.getReasonPhrase());
            }
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            transferIpResponse.setStatusCode(Status.BAD_REQUEST.getStatusCode());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(transferIpResponse.getStatusCode()).body(transferIpResponse);
    }

    /**
     * declare LinkAsset method
     * userId become after getToken from hashmap variable
     *
     * @param linkAssetModel
     * @return LinkAssetResponseDTO
     */
    @Override
    public ResponseEntity<LinkAssetResponseDTO> linkAsset(String appName, String token, LinkAssetRequest linkAssetModel) {
        LinkAssetResponseDTO linkAssetResponse = new LinkAssetResponseDTO();
        try {
            linkAssetResponse = assetService.linkAsset(linkAssetModel);
            log.info("linkAsset details receive from service response is: {}", linkAssetResponse);
        } catch (Exception e) {
            log.error(EXCEPTION_MESSAGE_LOG_RESOURCE, e.getMessage());
            linkAssetResponse.setMessage(Status.BAD_REQUEST.getStatusCode());
            throw Problem.builder().withStatus(Status.BAD_REQUEST).withDetail(e.getMessage()).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(linkAssetResponse);
    }

    /**
     * declare Location method
     * userId become after getToken from hashmap variable
     *
     * @param maxResponseId
     * @param offset
     * @return LocationsResponseDTO
     */
    @Override
    public Mono<LocationsResponseDTO> getLocation(String appName, String token, Integer maxResponseId, Integer offset) {
        log.info("location details receive with this offset value: {}", offset);
        try {
            return assetService.getLocations(maxResponseId, offset);
        } catch (Exception e) {
            if (e instanceof WebClientResponseException) throw Problem
                .builder()
                .withStatus(Status.valueOf(((WebClientResponseException) e).getRawStatusCode()))
                .build();
            throw Problem.builder().withStatus(Status.PRECONDITION_FAILED).build();
        }
    }
}
