package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;
import org.sohagroup.ir.service.dto.UpdateAssetStatusResponse;

public class UpdateAssetStatusResponseDTO {

    private UpdateAssetStatusResponse updateAssetStatusResponse;

    private int statusCode;

    private String statusMessage;

    public UpdateAssetStatusResponse getUpdateAssetStatusResponse() {
        return updateAssetStatusResponse;
    }

    public void setUpdateAssetStatusResponse(UpdateAssetStatusResponse updateAssetStatusResponse) {
        this.updateAssetStatusResponse = updateAssetStatusResponse;
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
        UpdateAssetStatusResponseDTO that = (UpdateAssetStatusResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(updateAssetStatusResponse, that.updateAssetStatusResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateAssetStatusResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "UpdateAssetStatusResponseDTO{" +
            "updateAssetStatusResponse=" +
            updateAssetStatusResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
