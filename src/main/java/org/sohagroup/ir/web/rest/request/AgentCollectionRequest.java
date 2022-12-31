package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class AgentCollectionRequest {

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
    @JsonProperty("IsRemoveLink")
    private int isRemoveLink;

    @JsonProperty("ChildAssetCode")
    private String childAssetCode;

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

    public int getIsRemoveLink() {
        return isRemoveLink;
    }

    public void setIsRemoveLink(int isRemoveLink) {
        this.isRemoveLink = isRemoveLink;
    }

    public String getChildAssetCode() {
        return childAssetCode;
    }

    public void setChildAssetCode(String childAssetCode) {
        this.childAssetCode = childAssetCode;
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
        if (o == null || getClass() != o.getClass()) return false;
        AgentCollectionRequest that = (AgentCollectionRequest) o;
        return (
            isRemoveLink == that.isRemoveLink &&
            allottedTo == that.allottedTo &&
            Objects.equals(assetCode, that.assetCode) &&
            Objects.equals(status, that.status) &&
            Objects.equals(agentCode, that.agentCode) &&
            Objects.equals(childAssetCode, that.childAssetCode) &&
            Objects.equals(userId, that.userId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetCode, status, agentCode, isRemoveLink, childAssetCode, allottedTo, userId);
    }

    @Override
    public String toString() {
        return (
            "AssetInstallationRequest{" +
            "assetCode='" +
            assetCode +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", agentCode='" +
            agentCode +
            '\'' +
            ", isRemoveLink=" +
            isRemoveLink +
            ", childAssetCode='" +
            childAssetCode +
            '\'' +
            ", allottedTo=" +
            allottedTo +
            ", userId=" +
            userId +
            '}'
        );
    }
}
