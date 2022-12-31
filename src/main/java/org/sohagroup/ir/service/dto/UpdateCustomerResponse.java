package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateCustomerResponse {

    @JsonProperty("Message")
    private int message;

    @JsonProperty("ErrorData")
    private ErrorDataDTO errorData;

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public ErrorDataDTO getErrorData() {
        return errorData;
    }

    public void setErrorData(ErrorDataDTO errorData) {
        this.errorData = errorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateCustomerResponse that = (UpdateCustomerResponse) o;
        return message == that.message && Objects.equals(errorData, that.errorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, errorData);
    }

    @Override
    public String toString() {
        return "UpdateCustomerResponse{" + "message=" + message + ", errorData=" + errorData + '}';
    }
}
