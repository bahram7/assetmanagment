package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AgentCreditResponse {

    @JsonProperty("Result")
    private String result;

    @JsonProperty("Message")
    private int message;

    @JsonProperty("ErrorData")
    private ErrorDataDTO errorData;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

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
        AgentCreditResponse that = (AgentCreditResponse) o;
        return message == that.message && Objects.equals(result, that.result) && Objects.equals(errorData, that.errorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message, errorData);
    }

    @Override
    public String toString() {
        return "AgentCreditResponse{" + "result='" + result + '\'' + ", message=" + message + ", errorData=" + errorData + '}';
    }
}
