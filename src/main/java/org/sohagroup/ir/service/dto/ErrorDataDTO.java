package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ErrorDataDTO {

    @JsonProperty("AppId")
    private int appId;

    @JsonProperty("AssetId")
    private int assetId;

    @JsonProperty("ProcessStatus")
    private int processStatus;

    @JsonProperty("Error")
    private String error;

    @JsonProperty("IsImage")
    private boolean isImage;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(int processStatus) {
        this.processStatus = processStatus;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean image) {
        isImage = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ErrorDataDTO)) return false;
        ErrorDataDTO that = (ErrorDataDTO) o;
        return (
            appId == that.appId &&
            assetId == that.assetId &&
            processStatus == that.processStatus &&
            isImage == that.isImage &&
            Objects.equals(error, that.error)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, assetId, processStatus, error, isImage);
    }

    @Override
    public String toString() {
        return (
            "ErrorDataDTO{" +
            "appId=" +
            appId +
            ", assetId=" +
            assetId +
            ", processStatus=" +
            processStatus +
            ", error='" +
            error +
            '\'' +
            ", isImage=" +
            isImage +
            '}'
        );
    }
}
