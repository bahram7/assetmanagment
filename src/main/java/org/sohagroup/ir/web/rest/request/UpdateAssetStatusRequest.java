package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class UpdateAssetStatusRequest {

    @NotNull
    @JsonProperty("Assetcode")
    private String assetCode;

    @NotNull
    @JsonProperty("status")
    private String status;

    @JsonProperty(value = "Location")
    private String location;

    @JsonProperty("AllottedTO")
    private String allottedTO;

    @JsonProperty("remark")
    private String remark;

    @JsonProperty("IsCustomUpdate")
    private boolean isCustomUpdate;

    @JsonProperty("Installedto")
    private String installedTo;

    @JsonProperty("UnitFirst")
    private String unitFirst;

    @JsonProperty("UnitLast")
    private String unitLast;

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

    public String getAllottedTO() {
        return allottedTO;
    }

    public void setAllottedTO(String allottedTO) {
        this.allottedTO = allottedTO;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isCustomUpdate() {
        return isCustomUpdate;
    }

    public void setCustomUpdate(boolean customUpdate) {
        isCustomUpdate = customUpdate;
    }

    public String getInstalledTo() {
        return installedTo;
    }

    public void setInstalledTo(String installedTo) {
        this.installedTo = installedTo;
    }

    public String getUnitFirst() {
        return unitFirst;
    }

    public void setUnitFirst(String unitFirst) {
        this.unitFirst = unitFirst;
    }

    public String getUnitLast() {
        return unitLast;
    }

    public void setUnitLast(String unitLast) {
        this.unitLast = unitLast;
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
        UpdateAssetStatusRequest that = (UpdateAssetStatusRequest) o;
        return (
            isCustomUpdate == that.isCustomUpdate &&
            Objects.equals(assetCode, that.assetCode) &&
            Objects.equals(status, that.status) &&
            Objects.equals(location, that.location) &&
            Objects.equals(allottedTO, that.allottedTO) &&
            Objects.equals(remark, that.remark) &&
            Objects.equals(installedTo, that.installedTo) &&
            Objects.equals(unitFirst, that.unitFirst) &&
            Objects.equals(unitLast, that.unitLast) &&
            Objects.equals(userId, that.userId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetCode, status, location, allottedTO, remark, isCustomUpdate, installedTo, unitFirst, unitLast, userId);
    }

    @Override
    public String toString() {
        return (
            "UpdateAssetStatusRequest{" +
            "assetCode='" +
            assetCode +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", location='" +
            location +
            '\'' +
            ", allottedTO='" +
            allottedTO +
            '\'' +
            ", remark='" +
            remark +
            '\'' +
            ", isCustomUpdate=" +
            isCustomUpdate +
            ", installedTo='" +
            installedTo +
            '\'' +
            ", unitFirst='" +
            unitFirst +
            '\'' +
            ", unitLast='" +
            unitLast +
            '\'' +
            ", userId='" +
            userId +
            '\'' +
            '}'
        );
    }
}
