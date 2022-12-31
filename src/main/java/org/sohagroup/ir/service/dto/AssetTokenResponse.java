package org.sohagroup.ir.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AssetTokenResponse {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("as:client_id")
    private String clientId;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("company")
    private String company;

    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("LanguageCode")
    private String languageCode;

    @JsonProperty("logo")
    private String logo;

    @JsonProperty("transferSetting")
    private String transferSetting;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("LocationId")
    private String locationId;

    @JsonProperty("AssetView")
    private String assetView;

    @JsonProperty("geoLocationRequired")
    private String geoLocationRequired;

    @JsonProperty("geoLocationShow")
    private String geoLocationShow;

    @JsonProperty("assetScan")
    private String assetScan;

    @JsonProperty("ticketBindLocation")
    private String ticketBindLocation;

    @JsonProperty("isExternal")
    private String isExternal;

    @JsonProperty("TrackerFilter")
    private String trackerFilter;

    @JsonProperty("isFilterHide")
    private String isFilterHide;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("ticketAssetRequired")
    private String ticketAssetRequired;

    @JsonProperty("ticketCheckIn")
    private String ticketCheckIn;

    @JsonProperty("siteBased")
    private String siteBased;

    @JsonProperty("badgeCount")
    private String badgeCount;

    @JsonProperty("DateFormat")
    private String dateFormat;

    @JsonProperty("assetDepartmentFilter")
    private String assetDepartmentFilter;

    @JsonProperty("FileUrl")
    private String fileUrl;

    @JsonProperty("OTPRequired")
    private String otpRequired;

    @JsonProperty("IsCordinate")
    private String isCoordinate;

    @JsonProperty("showMap")
    private String showMap;

    @JsonProperty("isChangePasswordNeed")
    private String isChangePasswordNeed;

    @JsonProperty("OTPTimeOut")
    private String otpTimeOut;

    @JsonProperty("hideDepartment")
    private String hideDepartment;

    @JsonProperty("hideCondition")
    private String hideCondition;

    @JsonProperty("ticketAssigneeSame")
    private String ticketAssigneeSame;

    @JsonProperty("isPullout")
    private String isPullout;

    @JsonProperty("defaultScreen")
    private String defaultScreen;

    @JsonProperty("ticketLocationDisable")
    private String ticketLocationDisable;

    @JsonProperty("userType")
    private String userType;

    @JsonProperty("allowAllStatus")
    private String allowAllStatus;

    @JsonProperty("roleId")
    private String roleId;

    @JsonProperty("apkUrl")
    private String apkUrl;

    @JsonProperty("iosUrl")
    private String iosUrl;

    @JsonProperty("ScheduleTime")
    private String scheduleTime;

    @JsonProperty("IssueTime")
    private String issueTime;

    @JsonProperty("ExpiredTime")
    private String expiredTime;

    @JsonProperty("loginCheck")
    private String loginCheck;

    @JsonProperty("deviceType")
    private String deviceType;

    @JsonProperty("MobileNo")
    private String mobileNo;

    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("LocationName")
    private String locationName;

    @JsonProperty("organisationType")
    private String organisationType;

    @JsonProperty("paymentTerm")
    private String paymentTerm;

    @JsonProperty("expiryDate")
    private String expiryDate;

    @JsonProperty("FileSize")
    private String fileSize;

    @JsonProperty(".issued")
    private String issued;

    @JsonProperty(".expires")
    private String expires;

    @JsonProperty("TokenId")
    private Long tokenId;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTransferSetting() {
        return transferSetting;
    }

    public void setTransferSetting(String transferSetting) {
        this.transferSetting = transferSetting;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getAssetView() {
        return assetView;
    }

    public void setAssetView(String assetView) {
        this.assetView = assetView;
    }

    public String getGeoLocationRequired() {
        return geoLocationRequired;
    }

    public void setGeoLocationRequired(String geoLocationRequired) {
        this.geoLocationRequired = geoLocationRequired;
    }

    public String getGeoLocationShow() {
        return geoLocationShow;
    }

    public void setGeoLocationShow(String geoLocationShow) {
        this.geoLocationShow = geoLocationShow;
    }

    public String getAssetScan() {
        return assetScan;
    }

    public void setAssetScan(String assetScan) {
        this.assetScan = assetScan;
    }

    public String getTicketBindLocation() {
        return ticketBindLocation;
    }

    public void setTicketBindLocation(String ticketBindLocation) {
        this.ticketBindLocation = ticketBindLocation;
    }

    public String getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(String isExternal) {
        this.isExternal = isExternal;
    }

    public String getTrackerFilter() {
        return trackerFilter;
    }

    public void setTrackerFilter(String trackerFilter) {
        this.trackerFilter = trackerFilter;
    }

    public String getIsFilterHide() {
        return isFilterHide;
    }

    public void setIsFilterHide(String isFilterHide) {
        this.isFilterHide = isFilterHide;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTicketAssetRequired() {
        return ticketAssetRequired;
    }

    public void setTicketAssetRequired(String ticketAssetRequired) {
        this.ticketAssetRequired = ticketAssetRequired;
    }

    public String getTicketCheckIn() {
        return ticketCheckIn;
    }

    public void setTicketCheckIn(String ticketCheckIn) {
        this.ticketCheckIn = ticketCheckIn;
    }

    public String getSiteBased() {
        return siteBased;
    }

    public void setSiteBased(String siteBased) {
        this.siteBased = siteBased;
    }

    public String getBadgeCount() {
        return badgeCount;
    }

    public void setBadgeCount(String badgeCount) {
        this.badgeCount = badgeCount;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getAssetDepartmentFilter() {
        return assetDepartmentFilter;
    }

    public void setAssetDepartmentFilter(String assetDepartmentFilter) {
        this.assetDepartmentFilter = assetDepartmentFilter;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getOtpRequired() {
        return otpRequired;
    }

    public void setOtpRequired(String otpRequired) {
        this.otpRequired = otpRequired;
    }

    public String getIsCoordinate() {
        return isCoordinate;
    }

    public void setIsCoordinate(String isCoordinate) {
        this.isCoordinate = isCoordinate;
    }

    public String getShowMap() {
        return showMap;
    }

    public void setShowMap(String showMap) {
        this.showMap = showMap;
    }

    public String getIsChangePasswordNeed() {
        return isChangePasswordNeed;
    }

    public void setIsChangePasswordNeed(String isChangePasswordNeed) {
        this.isChangePasswordNeed = isChangePasswordNeed;
    }

    public String getOtpTimeOut() {
        return otpTimeOut;
    }

    public void setOtpTimeOut(String otpTimeOut) {
        this.otpTimeOut = otpTimeOut;
    }

    public String getHideDepartment() {
        return hideDepartment;
    }

    public void setHideDepartment(String hideDepartment) {
        this.hideDepartment = hideDepartment;
    }

    public String getHideCondition() {
        return hideCondition;
    }

    public void setHideCondition(String hideCondition) {
        this.hideCondition = hideCondition;
    }

    public String getTicketAssigneeSame() {
        return ticketAssigneeSame;
    }

    public void setTicketAssigneeSame(String ticketAssigneeSame) {
        this.ticketAssigneeSame = ticketAssigneeSame;
    }

    public String getIsPullout() {
        return isPullout;
    }

    public void setIsPullout(String isPullout) {
        this.isPullout = isPullout;
    }

    public String getDefaultScreen() {
        return defaultScreen;
    }

    public void setDefaultScreen(String defaultScreen) {
        this.defaultScreen = defaultScreen;
    }

    public String getTicketLocationDisable() {
        return ticketLocationDisable;
    }

    public void setTicketLocationDisable(String ticketLocationDisable) {
        this.ticketLocationDisable = ticketLocationDisable;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAllowAllStatus() {
        return allowAllStatus;
    }

    public void setAllowAllStatus(String allowAllStatus) {
        this.allowAllStatus = allowAllStatus;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }

    public String getIosUrl() {
        return iosUrl;
    }

    public void setIosUrl(String iosUrl) {
        this.iosUrl = iosUrl;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getLoginCheck() {
        return loginCheck;
    }

    public void setLoginCheck(String loginCheck) {
        this.loginCheck = loginCheck;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getOrganisationType() {
        return organisationType;
    }

    public void setOrganisationType(String organisationType) {
        this.organisationType = organisationType;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssetTokenResponse)) return false;
        AssetTokenResponse that = (AssetTokenResponse) o;
        return (
            expiresIn == that.expiresIn &&
            Objects.equals(accessToken, that.accessToken) &&
            Objects.equals(tokenType, that.tokenType) &&
            Objects.equals(clientId, that.clientId) &&
            Objects.equals(userId, that.userId) &&
            Objects.equals(company, that.company) &&
            Objects.equals(deviceId, that.deviceId) &&
            Objects.equals(status, that.status) &&
            Objects.equals(languageCode, that.languageCode) &&
            Objects.equals(logo, that.logo) &&
            Objects.equals(transferSetting, that.transferSetting) &&
            Objects.equals(userName, that.userName) &&
            Objects.equals(locationId, that.locationId) &&
            Objects.equals(assetView, that.assetView) &&
            Objects.equals(geoLocationRequired, that.geoLocationRequired) &&
            Objects.equals(geoLocationShow, that.geoLocationShow) &&
            Objects.equals(assetScan, that.assetScan) &&
            Objects.equals(ticketBindLocation, that.ticketBindLocation) &&
            Objects.equals(isExternal, that.isExternal) &&
            Objects.equals(trackerFilter, that.trackerFilter) &&
            Objects.equals(isFilterHide, that.isFilterHide) &&
            Objects.equals(email, that.email) &&
            Objects.equals(ticketAssetRequired, that.ticketAssetRequired) &&
            Objects.equals(ticketCheckIn, that.ticketCheckIn) &&
            Objects.equals(siteBased, that.siteBased) &&
            Objects.equals(badgeCount, that.badgeCount) &&
            Objects.equals(dateFormat, that.dateFormat) &&
            Objects.equals(assetDepartmentFilter, that.assetDepartmentFilter) &&
            Objects.equals(fileUrl, that.fileUrl) &&
            Objects.equals(otpRequired, that.otpRequired) &&
            Objects.equals(isCoordinate, that.isCoordinate) &&
            Objects.equals(showMap, that.showMap) &&
            Objects.equals(isChangePasswordNeed, that.isChangePasswordNeed) &&
            Objects.equals(otpTimeOut, that.otpTimeOut) &&
            Objects.equals(hideDepartment, that.hideDepartment) &&
            Objects.equals(hideCondition, that.hideCondition) &&
            Objects.equals(ticketAssigneeSame, that.ticketAssigneeSame) &&
            Objects.equals(isPullout, that.isPullout) &&
            Objects.equals(defaultScreen, that.defaultScreen) &&
            Objects.equals(ticketLocationDisable, that.ticketLocationDisable) &&
            Objects.equals(userType, that.userType) &&
            Objects.equals(allowAllStatus, that.allowAllStatus) &&
            Objects.equals(roleId, that.roleId) &&
            Objects.equals(apkUrl, that.apkUrl) &&
            Objects.equals(iosUrl, that.iosUrl) &&
            Objects.equals(scheduleTime, that.scheduleTime) &&
            Objects.equals(issueTime, that.issueTime) &&
            Objects.equals(expiredTime, that.expiredTime) &&
            Objects.equals(loginCheck, that.loginCheck) &&
            Objects.equals(deviceType, that.deviceType) &&
            Objects.equals(mobileNo, that.mobileNo) &&
            Objects.equals(latitude, that.latitude) &&
            Objects.equals(longitude, that.longitude) &&
            Objects.equals(locationName, that.locationName) &&
            Objects.equals(organisationType, that.organisationType) &&
            Objects.equals(paymentTerm, that.paymentTerm) &&
            Objects.equals(expiryDate, that.expiryDate) &&
            Objects.equals(fileSize, that.fileSize) &&
            Objects.equals(issued, that.issued) &&
            Objects.equals(expires, that.expires) &&
            Objects.equals(tokenId, that.tokenId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            tokenType,
            expiresIn,
            clientId,
            userId,
            company,
            deviceId,
            status,
            languageCode,
            logo,
            transferSetting,
            userName,
            locationId,
            assetView,
            geoLocationRequired,
            geoLocationShow,
            assetScan,
            ticketBindLocation,
            isExternal,
            trackerFilter,
            isFilterHide,
            email,
            ticketAssetRequired,
            ticketCheckIn,
            siteBased,
            badgeCount,
            dateFormat,
            assetDepartmentFilter,
            fileUrl,
            otpRequired,
            isCoordinate,
            showMap,
            isChangePasswordNeed,
            otpTimeOut,
            hideDepartment,
            hideCondition,
            ticketAssigneeSame,
            isPullout,
            defaultScreen,
            ticketLocationDisable,
            userType,
            allowAllStatus,
            roleId,
            apkUrl,
            iosUrl,
            scheduleTime,
            issueTime,
            expiredTime,
            loginCheck,
            deviceType,
            mobileNo,
            latitude,
            longitude,
            locationName,
            organisationType,
            paymentTerm,
            expiryDate,
            fileSize,
            issued,
            expires,
            tokenId
        );
    }

    @Override
    public String toString() {
        return (
            "AssetTokenResponse{" +
            "accessToken='" +
            accessToken +
            '\'' +
            ", tokenType='" +
            tokenType +
            '\'' +
            ", expiresIn=" +
            expiresIn +
            ", clientId='" +
            clientId +
            '\'' +
            ", userId='" +
            userId +
            '\'' +
            ", company='" +
            company +
            '\'' +
            ", deviceId='" +
            deviceId +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", languageCode='" +
            languageCode +
            '\'' +
            ", logo='" +
            logo +
            '\'' +
            ", transferSetting='" +
            transferSetting +
            '\'' +
            ", userName='" +
            userName +
            '\'' +
            ", locationId='" +
            locationId +
            '\'' +
            ", assetView='" +
            assetView +
            '\'' +
            ", geoLocationRequired='" +
            geoLocationRequired +
            '\'' +
            ", geoLocationShow='" +
            geoLocationShow +
            '\'' +
            ", assetScan='" +
            assetScan +
            '\'' +
            ", ticketBindLocation='" +
            ticketBindLocation +
            '\'' +
            ", isExternal='" +
            isExternal +
            '\'' +
            ", trackerFilter='" +
            trackerFilter +
            '\'' +
            ", isFilterHide='" +
            isFilterHide +
            '\'' +
            ", email='" +
            email +
            '\'' +
            ", ticketAssetRequired='" +
            ticketAssetRequired +
            '\'' +
            ", ticketCheckIn='" +
            ticketCheckIn +
            '\'' +
            ", siteBased='" +
            siteBased +
            '\'' +
            ", badgeCount='" +
            badgeCount +
            '\'' +
            ", dateFormat='" +
            dateFormat +
            '\'' +
            ", assetDepartmentFilter='" +
            assetDepartmentFilter +
            '\'' +
            ", fileUrl='" +
            fileUrl +
            '\'' +
            ", otpRequired='" +
            otpRequired +
            '\'' +
            ", isCoordinate='" +
            isCoordinate +
            '\'' +
            ", showMap='" +
            showMap +
            '\'' +
            ", isChangePasswordNeed='" +
            isChangePasswordNeed +
            '\'' +
            ", otpTimeOut='" +
            otpTimeOut +
            '\'' +
            ", hideDepartment='" +
            hideDepartment +
            '\'' +
            ", hideCondition='" +
            hideCondition +
            '\'' +
            ", ticketAssigneeSame='" +
            ticketAssigneeSame +
            '\'' +
            ", isPullout='" +
            isPullout +
            '\'' +
            ", defaultScreen='" +
            defaultScreen +
            '\'' +
            ", ticketLocationDisable='" +
            ticketLocationDisable +
            '\'' +
            ", userType='" +
            userType +
            '\'' +
            ", allowAllStatus='" +
            allowAllStatus +
            '\'' +
            ", roleId='" +
            roleId +
            '\'' +
            ", apkUrl='" +
            apkUrl +
            '\'' +
            ", iosUrl='" +
            iosUrl +
            '\'' +
            ", scheduleTime='" +
            scheduleTime +
            '\'' +
            ", issueTime=" +
            issueTime +
            ", expiredTime=" +
            expiredTime +
            ", loginCheck='" +
            loginCheck +
            '\'' +
            ", deviceType='" +
            deviceType +
            '\'' +
            ", mobileNo='" +
            mobileNo +
            '\'' +
            ", latitude='" +
            latitude +
            '\'' +
            ", longitude='" +
            longitude +
            '\'' +
            ", locationName='" +
            locationName +
            '\'' +
            ", organisationType='" +
            organisationType +
            '\'' +
            ", paymentTerm='" +
            paymentTerm +
            '\'' +
            ", expiryDate='" +
            expiryDate +
            '\'' +
            ", fileSize='" +
            fileSize +
            '\'' +
            ", issued='" +
            issued +
            '\'' +
            ", expires='" +
            expires +
            '\'' +
            ", tokenId=" +
            tokenId +
            '}'
        );
    }
}
