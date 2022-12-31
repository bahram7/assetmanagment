package org.sohagroup.ir.service;

import java.util.Map;
import org.sohagroup.ir.service.dto.AgentCreditResponse;
import org.sohagroup.ir.service.dto.AssetInstallationResponse;
import org.sohagroup.ir.service.dto.SupportTicketConfirmationResponse;
import org.sohagroup.ir.service.dto.UpdateCustomerResponse;
import org.sohagroup.ir.web.rest.model.response.*;
import org.sohagroup.ir.web.rest.request.*;
import reactor.core.publisher.Mono;

public interface AssetService {
    AssetTokenResponseDTO getToken();
    ViewAssetResponse getViewAssetList(Map<String, String> assetInput);

    UpdateAssetStatusResponseDTO updateAssetStatus(UpdateAssetStatusRequest updateAssetStatusModel);

    AssetInstallationResponse assetInstallation(AgentCollectionRequest assetInstallationModel);

    SupportTicketConfirmationResponse supportTicketConfirmation(SupportTicketConfirmationRequest supportTicketConfirmationModel);

    TransferIpResponseDTO transferIp(TransferIpRequestDTO transferIpRequestModel);

    AgentCreditResponse getAgentCredit(String agentCode);

    UpdateCustomerResponse agentCollection(UpdateCustomerRequestDTO updateCustomerRequestModel);

    LinkAssetResponseDTO linkAsset(LinkAssetRequest linkAssetModel);

    Mono<LocationsResponseDTO> getLocations(Integer maxResponseId, Integer offset);
}
