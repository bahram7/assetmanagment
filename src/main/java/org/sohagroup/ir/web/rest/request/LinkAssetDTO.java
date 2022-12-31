package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class LinkAssetDTO {

    @NotNull
    @JsonProperty("assetcode")
    private String assetCode;

    @NotNull
    @JsonProperty("linkassetcode")
    private String linkAssetCode;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkAssetDTO that = (LinkAssetDTO) o;
        return Objects.equals(assetCode, that.assetCode) && Objects.equals(linkAssetCode, that.linkAssetCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetCode, linkAssetCode);
    }

    @Override
    public String toString() {
        return "LinkAssetDTO{" + "assetCode='" + assetCode + '\'' + ", linkAssetCode='" + linkAssetCode + '\'' + '}';
    }
}
