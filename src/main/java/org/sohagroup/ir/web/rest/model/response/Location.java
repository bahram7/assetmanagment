package org.sohagroup.ir.web.rest.model.response;

import java.util.Objects;

public class Location {

    private Integer dataMode;
    private Integer locationId;
    private String parentLocation;
    private String locationName;
    private String description;
    private Integer level;
    private Integer childCount;
    private Integer parentLocationId;
    private Integer status;
    private String longitude;
    private String latitude;
    private String locationCode;
    private Integer isInventory;

    public Location() {}

    public Location(
        Integer dataMode,
        Integer locationId,
        String parentLocation,
        String locationName,
        String description,
        Integer level,
        Integer childCount,
        Integer parentLocationId,
        Integer status,
        String longitude,
        String latitude,
        String locationCode,
        Integer isInventory
    ) {
        this.dataMode = dataMode;
        this.locationId = locationId;
        this.parentLocation = parentLocation;
        this.locationName = locationName;
        this.description = description;
        this.level = level;
        this.childCount = childCount;
        this.parentLocationId = parentLocationId;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationCode = locationCode;
        this.isInventory = isInventory;
    }

    public Integer getDataMode() {
        return dataMode;
    }

    public void setDataMode(Integer dataMode) {
        this.dataMode = dataMode;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(String parentLocation) {
        this.parentLocation = parentLocation;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public Integer getParentLocationId() {
        return parentLocationId;
    }

    public void setParentLocationId(Integer parentLocationId) {
        this.parentLocationId = parentLocationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public Integer getIsInventory() {
        return isInventory;
    }

    public void setIsInventory(Integer isInventory) {
        this.isInventory = isInventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return (
            Objects.equals(dataMode, location.dataMode) &&
            Objects.equals(locationId, location.locationId) &&
            Objects.equals(parentLocation, location.parentLocation) &&
            Objects.equals(locationName, location.locationName) &&
            Objects.equals(description, location.description) &&
            Objects.equals(level, location.level) &&
            Objects.equals(childCount, location.childCount) &&
            Objects.equals(parentLocationId, location.parentLocationId) &&
            Objects.equals(status, location.status) &&
            Objects.equals(longitude, location.longitude) &&
            Objects.equals(latitude, location.latitude) &&
            Objects.equals(locationCode, location.locationCode) &&
            Objects.equals(isInventory, location.isInventory)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataMode,
            locationId,
            parentLocation,
            locationName,
            description,
            level,
            childCount,
            parentLocationId,
            status,
            longitude,
            latitude,
            locationCode,
            isInventory
        );
    }

    @Override
    public String toString() {
        return (
            "Location{" +
            "dataMode=" +
            dataMode +
            ", locationId=" +
            locationId +
            ", parentLocation='" +
            parentLocation +
            '\'' +
            ", locationName='" +
            locationName +
            '\'' +
            ", description='" +
            description +
            '\'' +
            ", level=" +
            level +
            ", childCount=" +
            childCount +
            ", parentLocationId=" +
            parentLocationId +
            ", status=" +
            status +
            ", longitude='" +
            longitude +
            '\'' +
            ", latitude='" +
            latitude +
            '\'' +
            ", locationCode='" +
            locationCode +
            '\'' +
            ", isInventory=" +
            isInventory +
            '}'
        );
    }
}
