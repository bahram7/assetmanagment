package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class LinkAssetRequest {

    @NotNull
    @JsonProperty("assetList")
    private List<LinkAssetDTO> assetList;

    private String userId;

    public List<LinkAssetDTO> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<LinkAssetDTO> assetList) {
        this.assetList = assetList;
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
        LinkAssetRequest that = (LinkAssetRequest) o;
        return Objects.equals(assetList, that.assetList) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetList, userId);
    }

    @Override
    public String toString() {
        return "LinkAssetRequest{" + "assetList=" + assetList + ", userId='" + userId + '\'' + '}';
    }
}
