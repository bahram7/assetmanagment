package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class UpdateCustomerRequestDTO {

    @NotNull
    @JsonProperty("AssetCode")
    private String assetCode;

    @NotNull
    @JsonProperty("Status")
    private String status;

    @NotNull
    @JsonProperty("Location")
    private String location;

    @JsonProperty("CustomerDetails")
    private String customerDetails;

    @JsonProperty("ChildAssetcode")
    private String childAssetCode;

    @JsonProperty("CustomerName")
    private String customerName;

    @NotNull
    @JsonProperty("AgentCode")
    private String agentCode;

    @NotNull
    @JsonProperty("IsRemoveLink")
    private int isRemoveLink;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String getChildAssetCode() {
        return childAssetCode;
    }

    public void setChildAssetCode(String childAssetCode) {
        this.childAssetCode = childAssetCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
        UpdateCustomerRequestDTO that = (UpdateCustomerRequestDTO) o;
        return (
            isRemoveLink == that.isRemoveLink &&
            allottedTo == that.allottedTo &&
            Objects.equals(assetCode, that.assetCode) &&
            Objects.equals(status, that.status) &&
            Objects.equals(location, that.location) &&
            Objects.equals(customerDetails, that.customerDetails) &&
            Objects.equals(childAssetCode, that.childAssetCode) &&
            Objects.equals(customerName, that.customerName) &&
            Objects.equals(agentCode, that.agentCode) &&
            Objects.equals(userId, that.userId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            assetCode,
            status,
            location,
            customerDetails,
            childAssetCode,
            customerName,
            agentCode,
            isRemoveLink,
            allottedTo,
            userId
        );
    }

    @Override
    public String toString() {
        return (
            "UpdateCustomerRequestDTO{" +
            "assetCode='" +
            assetCode +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", location='" +
            location +
            '\'' +
            ", customerDetails='" +
            customerDetails +
            '\'' +
            ", childAssetCode='" +
            childAssetCode +
            '\'' +
            ", customerName='" +
            customerName +
            '\'' +
            ", agentCode='" +
            agentCode +
            '\'' +
            ", isRemoveLink=" +
            isRemoveLink +
            ", allottedTo=" +
            allottedTo +
            ", userId=" +
            userId +
            '}'
        );
    }
}
