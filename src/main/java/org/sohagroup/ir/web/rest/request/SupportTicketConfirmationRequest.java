package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class SupportTicketConfirmationRequest {

    @NotNull
    @JsonProperty("AssetCode")
    private String assetCode;

    @NotNull
    @JsonProperty("Status")
    private String status;

    @NotNull
    @JsonProperty("AgentCode")
    private String agentCode;

    @NotNull
    @JsonProperty("DamageAssetCode")
    private String damageAssetCode;

    @NotNull
    @JsonProperty("allottedTo")
    private int allottedTo;

    private String userId;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getDamageAssetCode() {
        return damageAssetCode;
    }

    public void setDamageAssetCode(String damageAssetCode) {
        this.damageAssetCode = damageAssetCode;
    }

    public int getAllottedTo() {
        return allottedTo;
    }

    public void setAllottedTo(int allottedTo) {
        this.allottedTo = allottedTo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupportTicketConfirmationRequest)) return false;
        SupportTicketConfirmationRequest that = (SupportTicketConfirmationRequest) o;
        return (
            allottedTo == that.allottedTo &&
            Objects.equals(assetCode, that.assetCode) &&
            Objects.equals(status, that.status) &&
            Objects.equals(agentCode, that.agentCode) &&
            Objects.equals(damageAssetCode, that.damageAssetCode) &&
            Objects.equals(userId, that.userId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetCode, status, agentCode, damageAssetCode, allottedTo, userId);
    }

    @Override
    public String toString() {
        return (
            "SupportTicketConfirmationRequest{" +
            "assetCode='" +
            assetCode +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", agentCode='" +
            agentCode +
            '\'' +
            ", damageAssetCode='" +
            damageAssetCode +
            '\'' +
            ", allottedTo=" +
            allottedTo +
            ", userId=" +
            userId +
            '}'
        );
    }
}
