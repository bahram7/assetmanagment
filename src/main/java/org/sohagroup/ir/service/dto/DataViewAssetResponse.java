package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class DataViewAssetResponse {

    @JsonProperty("AssetCode")
    private String assetCode;

    @JsonProperty("AssetName")
    private String assetName;

    @JsonProperty("CategoryCode")
    private String categoryCode;

    @JsonProperty("CategoryName")
    private String categoryName;

    @JsonProperty("LocationName")
    private String locationName;

    @JsonProperty("Serial")
    private String serial;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Brand")
    private String brand;

    @JsonProperty("LinkedAsset")
    private String linkedAsset;

    @JsonProperty("IMEI")
    private String imei;

    @JsonProperty("IMSI")
    private String imsi;

    @JsonProperty("ICCID")
    private String iccId;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLinkedAsset() {
        return linkedAsset;
    }

    public void setLinkedAsset(String linkedAsset) {
        this.linkedAsset = linkedAsset;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getIccId() {
        return iccId;
    }

    public void setIccId(String iccId) {
        this.iccId = iccId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataViewAssetResponse that = (DataViewAssetResponse) o;
        return (
            Objects.equals(assetCode, that.assetCode) &&
            Objects.equals(assetName, that.assetName) &&
            Objects.equals(categoryCode, that.categoryCode) &&
            Objects.equals(categoryName, that.categoryName) &&
            Objects.equals(locationName, that.locationName) &&
            Objects.equals(serial, that.serial) &&
            Objects.equals(status, that.status) &&
            Objects.equals(brand, that.brand) &&
            Objects.equals(linkedAsset, that.linkedAsset) &&
            Objects.equals(imei, that.imei) &&
            Objects.equals(imsi, that.imsi) &&
            Objects.equals(iccId, that.iccId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            assetCode,
            assetName,
            categoryCode,
            categoryName,
            locationName,
            serial,
            status,
            brand,
            linkedAsset,
            imei,
            imsi,
            iccId
        );
    }

    @Override
    public String toString() {
        return (
            "DataViewAssetResponse{" +
            "assetCode='" +
            assetCode +
            '\'' +
            ", assetName='" +
            assetName +
            '\'' +
            ", categoryCode='" +
            categoryCode +
            '\'' +
            ", categoryName='" +
            categoryName +
            '\'' +
            ", locationName='" +
            locationName +
            '\'' +
            ", serial='" +
            serial +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", brand='" +
            brand +
            '\'' +
            ", linkedAsset='" +
            linkedAsset +
            '\'' +
            ", imei='" +
            imei +
            '\'' +
            ", imsi='" +
            imsi +
            '\'' +
            ", iccId='" +
            iccId +
            '\'' +
            '}'
        );
    }
}
