package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;
import org.sohagroup.ir.service.dto.AssetInstallationResponse;

public class AgentCollectionResponseDTO {

    private AssetInstallationResponse assetInstallationResponse;

    private int statusCode;

    private String statusMessage;

    public AssetInstallationResponse getAssetInstallationResponse() {
        return assetInstallationResponse;
    }

    public void setAssetInstallationResponse(AssetInstallationResponse assetInstallationResponse) {
        this.assetInstallationResponse = assetInstallationResponse;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentCollectionResponseDTO that = (AgentCollectionResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(assetInstallationResponse, that.assetInstallationResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetInstallationResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "AssetInstallationResponseDTO{" +
            "assetInstallationResponse=" +
            assetInstallationResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
