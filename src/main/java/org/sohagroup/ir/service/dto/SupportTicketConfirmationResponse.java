package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class SupportTicketConfirmationResponse {

    @NotNull
    @JsonProperty("Message")
    private int message;

    @JsonProperty("ErrorData")
    private List<ErrorDataDTO> errorData;

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
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
        if (!(o instanceof SupportTicketConfirmationResponse)) return false;
        SupportTicketConfirmationResponse that = (SupportTicketConfirmationResponse) o;
        return message == that.message && Objects.equals(errorData, that.errorData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, errorData);
    }

    @Override
    public String toString() {
        return "SupportTicketConfirmationResponse{" + "message=" + message + ", errorData=" + errorData + '}';
    }
}
