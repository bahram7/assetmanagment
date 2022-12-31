package org.sohagroup.ir.web.rest.model.response;

import java.util.List;
import java.util.Objects;

public class LocationsResponseDTO {

    private String maxReturnModifiedDate;
    private Integer maxReturnResponseId;
    private Integer MessageCode;
    private List<Location> locationList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationsResponseDTO model = (LocationsResponseDTO) o;
        return (
            Objects.equals(maxReturnModifiedDate, model.maxReturnModifiedDate) &&
            Objects.equals(maxReturnResponseId, model.maxReturnResponseId) &&
            Objects.equals(MessageCode, model.MessageCode) &&
            Objects.equals(locationList, model.locationList)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxReturnModifiedDate, maxReturnResponseId, MessageCode, locationList);
    }

    @Override
    public String toString() {
        return (
            "LocationsResponseModel{" +
            "maxReturnModifiedDate='" +
            maxReturnModifiedDate +
            '\'' +
            ", maxReturnResponseId=" +
            maxReturnResponseId +
            ", MessageCode=" +
            MessageCode +
            ", locationList=" +
            locationList +
            '}'
        );
    }

    public String getMaxReturnModifiedDate() {
        return maxReturnModifiedDate;
    }

    public void setMaxReturnModifiedDate(String maxReturnModifiedDate) {
        this.maxReturnModifiedDate = maxReturnModifiedDate;
    }

    public Integer getMaxReturnResponseId() {
        return maxReturnResponseId;
    }

    public void setMaxReturnResponseId(Integer maxReturnResponseId) {
        this.maxReturnResponseId = maxReturnResponseId;
    }

    public Integer getMessageCode() {
        return MessageCode;
    }

    public void setMessageCode(Integer messageCode) {
        MessageCode = messageCode;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }
}
