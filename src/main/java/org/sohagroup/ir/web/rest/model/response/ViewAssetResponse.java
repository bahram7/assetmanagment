package org.sohagroup.ir.web.rest.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class ViewAssetResponse {

    @JsonProperty("MessageCode")
    private int messageCode;

    @JsonProperty("data")
    private List<DataViewAssetResponse> dataViewAssetResponses;

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public List<DataViewAssetResponse> getDataViewAssetResponses() {
        return dataViewAssetResponses;
    }

    public void setDataViewAssetResponses(List<DataViewAssetResponse> dataViewAssetResponses) {
        this.dataViewAssetResponses = dataViewAssetResponses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewAssetResponse that = (ViewAssetResponse) o;
        return messageCode == that.messageCode && Objects.equals(dataViewAssetResponses, that.dataViewAssetResponses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageCode, dataViewAssetResponses);
    }

    @Override
    public String toString() {
        return "ViewAssetResponse{" + "messageCode=" + messageCode + ", dataViewAssetResponses=" + dataViewAssetResponses + '}';
    }
}
