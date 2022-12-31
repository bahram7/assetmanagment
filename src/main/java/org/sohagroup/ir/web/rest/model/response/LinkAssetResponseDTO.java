package org.sohagroup.ir.web.rest.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;
import org.sohagroup.ir.service.dto.ErrorDataDTO;

public class LinkAssetResponseDTO {

    @JsonProperty("ErrorData")
    private List<ErrorDataDTO> errorData;

    @JsonProperty("Message")
    private Integer message;

    public List<ErrorDataDTO> getErrorData() {
        return errorData;
    }

    public void setErrorData(List<ErrorDataDTO> errorData) {
        this.errorData = errorData;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkAssetResponseDTO that = (LinkAssetResponseDTO) o;
        return Objects.equals(errorData, that.errorData) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorData, message);
    }

    @Override
    public String toString() {
        return "LinkAssetResponseDTO{" + "errorData=" + errorData + ", message=" + message + '}';
    }
}
