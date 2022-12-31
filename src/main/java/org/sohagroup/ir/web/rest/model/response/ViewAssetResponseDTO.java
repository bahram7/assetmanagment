package org.sohagroup.ir.web.rest.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class ViewAssetResponseDTO {

    private ViewAssetResponse viewAssetResponse;

    private int statusCode;

    private String statusMessage;

    public ViewAssetResponse getViewAssetResponse() {
        return viewAssetResponse;
    }

    public void setViewAssetResponse(ViewAssetResponse viewAssetResponse) {
        this.viewAssetResponse = viewAssetResponse;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewAssetResponseDTO that = (ViewAssetResponseDTO) o;
        return (
            statusCode == that.statusCode &&
            Objects.equals(viewAssetResponse, that.viewAssetResponse) &&
            Objects.equals(statusMessage, that.statusMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(viewAssetResponse, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        return (
            "ViewAssetResponseDTO{" +
            "viewAssetResponse=" +
            viewAssetResponse +
            ", statusCode=" +
            statusCode +
            ", statusMessage='" +
            statusMessage +
            '\'' +
            '}'
        );
    }
}
