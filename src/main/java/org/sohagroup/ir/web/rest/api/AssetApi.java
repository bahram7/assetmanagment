package org.sohagroup.ir.web.rest.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.sohagroup.ir.web.rest.model.response.*;
import org.sohagroup.ir.web.rest.request.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Validated
@OpenAPIDefinition(servers = { @Server(url = "/services/assetmanagmentservice/") })
@RestController
@Tag(name = "assetmanagmentservice")
public interface AssetApi {
    @Operation(description = "AssetToken")
    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = AssetTokenResponseDTO.class)))
            ),
        }
    )
    @PostMapping(value = "/api/Token")
    public ResponseEntity<AssetTokenResponseDTO> getToken();

    @GetMapping(value = "/api/viewAsset")
    ResponseEntity<ViewAssetResponseDTO> getViewAssetList(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @Parameter(name = "search", required = true) @RequestParam(value = "search", required = true) String search,
        @Parameter(name = "AssetCode", required = false) @RequestParam(value = "AssetCode", required = false) String AssetCode,
        @Parameter(name = "AssetName", required = false) @RequestParam(value = "AssetName", required = false) String AssetName,
        @Parameter(name = "CategoryCode", required = false) @RequestParam(value = "CategoryCode", required = false) String CategoryCode,
        @Parameter(name = "CategoryName", required = false) @RequestParam(value = "CategoryName", required = false) String CategoryName,
        @Parameter(name = "LocationName", required = false) @RequestParam(value = "LocationName", required = false) String LocationName,
        @Parameter(name = "serial", required = false) @RequestParam(value = "serial", required = false) String Serial,
        @Parameter(name = "Status", required = false) @RequestParam(value = "Status", required = false) String Status,
        @Parameter(name = "Brand", required = false) @RequestParam(value = "Brand", required = false) String Brand,
        @Parameter(name = "LinkedAsset", required = false) @RequestParam(value = "LinkedAsset", required = false) String LinkedAsset,
        @Parameter(name = "IMEI", required = false) @RequestParam(value = "IMEI", required = false) String IMEI,
        @Parameter(name = "IMSI", required = false) @RequestParam(value = "IMSI", required = false) String IMSI,
        @Parameter(name = "ICCID", required = false) @RequestParam(value = "ICCID", required = false) String ICCID
    );

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = UpdateAssetStatusResponseDTO.class)))
            ),
        }
    )
    @PostMapping(value = "/api/updateAssetStatus")
    public ResponseEntity<UpdateAssetStatusResponseDTO> updateAssetStatus(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @RequestBody UpdateAssetStatusRequest updateAssetStatusModel
    );

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = AgentCreditResponseDTO.class)))
            ),
        }
    )
    //        response = AgentCreditResponseDTO.class) })
    @GetMapping(value = "/api/agentCredit")
    public ResponseEntity<AgentCreditResponseDTO> agentCredit(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @Parameter(name = "agentCode", required = true) @RequestParam(value = "agentCode", required = true) String agentCode
    );

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = UpdateCustomerResponseDTO.class)))
            ),
        }
    )
    //        response = UpdateCustomerResponseDTO.class) })
    @PostMapping(value = "/api/updateCustomer")
    public ResponseEntity<UpdateCustomerResponseDTO> updateCustomer(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @RequestBody UpdateCustomerRequestDTO updateCustomerRequestModel
    );

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = AgentCollectionResponseDTO.class)))
            ),
        }
    )
    //        response = AgentCollectionResponseDTO.class) })
    @PostMapping(value = "/api/agentCollection")
    public ResponseEntity<AgentCollectionResponseDTO> agentCollection(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @RequestBody AgentCollectionRequest agentCollectionRequest
    );

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = SupportTicketConfirmationResponseDTO.class)))
            ),
        }
    )
    @PostMapping(value = "/api/supportTicketConfirmation")
    public ResponseEntity<SupportTicketConfirmationResponseDTO> supportTicketConfirmation(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @RequestBody SupportTicketConfirmationRequest supportTicketConfirmationRequest
    );

    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = TransferIpResponseDTO.class)))
            ),
        }
    )
    @PostMapping(value = "/api/transferIp")
    public ResponseEntity<TransferIpResponseDTO> transferIp(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @RequestBody TransferIpRequestDTO transferIpRequestModel
    );

    //    @ApiOperation(value = "LinkAsset")
    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = LinkAssetResponseDTO.class)))
            ),
        }
    )
    @PostMapping(value = "/api/linkAsset")
    public ResponseEntity<LinkAssetResponseDTO> linkAsset(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @RequestBody LinkAssetRequest linkAssetModel
    );

    //    @ApiOperation(value = "AssetLocation")
    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200",
                description = "Success",
                content = @Content(array = @ArraySchema(schema = @Schema(implementation = LocationsResponseDTO.class)))
            ),
        }
    )
    @GetMapping(value = "/api/location", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<LocationsResponseDTO> getLocation(
        @Parameter(name = "appName", required = false) @RequestHeader(value = "appName", required = false) String appName,
        @Parameter(name = "token", required = false) @RequestHeader(value = "token", required = false) String token,
        @Parameter(name = "maxResponseId", required = true) @RequestParam(value = "maxResponseId", required = true) Integer maxResponseId,
        @Parameter(name = "offset", required = false) @RequestParam(value = "offset", required = false) Integer offset
    );
}
