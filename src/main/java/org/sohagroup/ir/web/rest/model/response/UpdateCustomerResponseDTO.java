package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;
import org.sohagroup.ir.service.dto.UpdateCustomerResponse;

public class UpdateCustomerResponseDTO {

    private UpdateCustomerResponse updateCustomerResponse;

    private int statusCode;

    private String statusMessage;

    public UpdateCustomerResponse getUpdateCustomerResponse() {
        return updateCustomerResponse;
    }

    public void setUpdateCustomerResponse(UpdateCustomerResponse updateCustomerResponse) {
        this.updateCustomerResponse = updateCustomerResponse;
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
        UpdateCustomerResponseDTO that = (UpdateCustomerResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(updateCustomerResponse, that.updateCustomerResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateCustomerResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "UpdateCustomerResponseDTO{" +
            "updateCustomerResponse=" +
            updateCustomerResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
