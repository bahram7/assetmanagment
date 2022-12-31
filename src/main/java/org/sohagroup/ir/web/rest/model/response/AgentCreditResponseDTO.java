package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;
import org.sohagroup.ir.service.dto.AgentCreditResponse;

public class AgentCreditResponseDTO {

    private AgentCreditResponse agentCreditResponse;

    private int statusCode;

    private String statusMessage;

    public AgentCreditResponse getAgentCreditResponse() {
        return agentCreditResponse;
    }

    public void setAgentCreditResponse(AgentCreditResponse agentCreditResponse) {
        this.agentCreditResponse = agentCreditResponse;
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
        AgentCreditResponseDTO that = (AgentCreditResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(agentCreditResponse, that.agentCreditResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentCreditResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "AgentCreditResponseDTO{" +
            "agentCreditResponse=" +
            agentCreditResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
