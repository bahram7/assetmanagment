package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class TransferIpRequestDTO {

    @NotNull
    @JsonProperty("locationId")
    private int locationId;

    @NotNull
    @JsonProperty("Status")
    private int status;

    @JsonProperty("allottedTo")
    private int allottedTo;

    @NotNull
    @JsonProperty("Assets")
    private List<AssetTransferIpDTO> assets;

    private String userId;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAllottedTo() {
        return allottedTo;
    }

    public void setAllottedTo(int allottedTo) {
        this.allottedTo = allottedTo;
    }

    public List<AssetTransferIpDTO> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetTransferIpDTO> assets) {
        this.assets = assets;
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
        TransferIpRequestDTO that = (TransferIpRequestDTO) o;
        return (
            locationId == that.locationId &&
            status == that.status &&
            allottedTo == that.allottedTo &&
            userId == that.userId &&
            Objects.equals(assets, that.assets)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, status, allottedTo, assets, userId);
    }

    @Override
    public String toString() {
        return (
            "TransferIpRequestDTO{" +
            "locationId=" +
            locationId +
            ", status=" +
            status +
            ", allottedTo=" +
            allottedTo +
            ", assets=" +
            assets +
            ", userId=" +
            userId +
            '}'
        );
    }
}
