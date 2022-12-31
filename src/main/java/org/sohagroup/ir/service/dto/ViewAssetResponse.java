package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class ViewAssetResponse {

    @JsonProperty("MessageCode")
    private int messageCode;

    @JsonProperty("data")
    private List<DataViewAssetResponse> dataViewAssetResponse;

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public List<DataViewAssetResponse> getDataViewAssetResponse() {
        return dataViewAssetResponse;
    }

    public void setDataViewAssetResponse(List<DataViewAssetResponse> dataViewAssetResponse) {
        this.dataViewAssetResponse = dataViewAssetResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewAssetResponse that = (ViewAssetResponse) o;
        return messageCode == that.messageCode && Objects.equals(dataViewAssetResponse, that.dataViewAssetResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageCode, dataViewAssetResponse);
    }

    @Override
    public String toString() {
        return "ViewAssetResponseDTO{" + "messageCode=" + messageCode + ", dataViewAssetResponse=" + dataViewAssetResponse + '}';
    }
}
