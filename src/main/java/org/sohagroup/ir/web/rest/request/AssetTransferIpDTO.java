package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AssetTransferIpDTO {

    @JsonProperty("assetId")
    private int assetId;

    @JsonProperty("transferId")
    private int transferId;

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssetTransferIpDTO that = (AssetTransferIpDTO) o;
        return assetId == that.assetId && transferId == that.transferId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, transferId);
    }

    @Override
    public String toString() {
        return "AssetTransferIpDTO{" + "assetId=" + assetId + ", transferId=" + transferId + '}';
    }
}
