package org.sohagroup.ir.web.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AssetTokenRequest {

    @JsonProperty("Username")
    private String userName;

    @JsonProperty("Password")
    private String password;

    @JsonProperty("grant_Type")
    private String grantType;

    @JsonProperty("client_Id")
    private String clientId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssetTokenRequest)) return false;
        AssetTokenRequest that = (AssetTokenRequest) o;
        return (
            Objects.equals(userName, that.userName) &&
            Objects.equals(password, that.password) &&
            Objects.equals(grantType, that.grantType) &&
            Objects.equals(clientId, that.clientId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, grantType, clientId);
    }

    @Override
    public String toString() {
        return (
            "AssetTokenRequest{" +
            "Username='" +
            userName +
            '\'' +
            ", Password='" +
            password +
            '\'' +
            ", grant_Type='" +
            grantType +
            '\'' +
            ", client_Id='" +
            clientId +
            '\'' +
            '}'
        );
    }
}
