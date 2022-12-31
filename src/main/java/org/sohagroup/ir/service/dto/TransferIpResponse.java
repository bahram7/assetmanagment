package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class TransferIpResponse {

    @JsonProperty("Message")
    private int message;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("error")
    private List<ErrorDataDTO> errorData;

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<ErrorDataDTO> getErrorData() {
        return errorData;
    }

    public void setErrorData(List<ErrorDataDTO> errorData) {
        this.errorData = errorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferIpResponse that = (TransferIpResponse) o;
        return message == that.message && Objects.equals(errorMessage, that.errorMessage) && Objects.equals(errorData, that.errorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, errorMessage, errorData);
    }

    @Override
    public String toString() {
        return "TransferIpResponse{" + "message=" + message + ", errorMessage='" + errorMessage + '\'' + ", errorData=" + errorData + '}';
    }
}
