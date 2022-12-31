package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;
import org.sohagroup.ir.service.dto.SupportTicketConfirmationResponse;

public class SupportTicketConfirmationResponseDTO {

    private SupportTicketConfirmationResponse supportTicketConfirmationResponse;

    private int statusCode;

    private String statusMessage;

    public SupportTicketConfirmationResponse getSupportTicketConfirmationResponse() {
        return supportTicketConfirmationResponse;
    }

    public void setSupportTicketConfirmationResponse(SupportTicketConfirmationResponse supportTicketConfirmationResponse) {
        this.supportTicketConfirmationResponse = supportTicketConfirmationResponse;
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
        if (!(o instanceof SupportTicketConfirmationResponseDTO)) return false;
        SupportTicketConfirmationResponseDTO that = (SupportTicketConfirmationResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(supportTicketConfirmationResponse, that.supportTicketConfirmationResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportTicketConfirmationResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "SupportTicketConfirmationResponseDTO{" +
            "supportTicketConfirmationResponse=" +
            supportTicketConfirmationResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
