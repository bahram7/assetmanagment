package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;

public class AssetTokenResponseDTO {

    private AssetTokenResponse assetTokenResponse;

    private String statusMessage;

    private int statusCode;

    public AssetTokenResponse getAssetTokenResponse() {
        return assetTokenResponse;
    }

    public void setAssetTokenResponse(AssetTokenResponse assetTokenResponse) {
        this.assetTokenResponse = assetTokenResponse;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssetTokenResponseDTO)) return false;
        AssetTokenResponseDTO that = (AssetTokenResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(assetTokenResponse, that.assetTokenResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetTokenResponse, statusMessage, statusCode);
    }

    @Override
    public String toString() {
        return (
            "AssetTokenResponseDTO{" +
            "assetTokenResponse=" +
            assetTokenResponse +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            ", statusCode=" +
            statusCode +
            '}'
        );
    }
}
