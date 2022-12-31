package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;
import org.sohagroup.ir.service.dto.TransferIpResponse;

public class TransferIpResponseDTO {

    private TransferIpResponse transferIpResponse;

    private int statusCode;

    private String statusMessage;

    public TransferIpResponse getTransferIpResponse() {
        return transferIpResponse;
    }

    public void setTransferIpResponse(TransferIpResponse transferIpResponse) {
        this.transferIpResponse = transferIpResponse;
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
        TransferIpResponseDTO that = (TransferIpResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(transferIpResponse, that.transferIpResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferIpResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "TransferIpResponseDTO{" +
            "transferIpResponse=" +
            transferIpResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
