package org.sohagroup.ir.config;

/**
 * Application constants.
 */
public final class Constants {

    public static final String LOGIN_REGEX = "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$";

    public static final String SYSTEM = "system";
    public static final String DEFAULT_LANGUAGE = "en";

    // Resource Constants
    public static final String EXCEPTION_MESSAGE_LOG_RESOURCE = "exception happen in resource because {}:";

    // Map Constants
    public static final String MAP_SEARCH = "search";
    public static final String MAP_ASSET_CODE = "AssetCode";
    public static final String MAP_ASSET_NAME = "AssetName";
    public static final String MAP_CATEGORY_CODE = "CategoryCode";
    public static final String MAP_CATEGORY_NAME = "CategoryName";
    public static final String MAP_LOCATION_NAME = "LocationName";
    public static final String MAP_SERIAL = "Serial";
    public static final String MAP_STATUS = "Status";
    public static final String MAP_BRAND = "Brand";
    public static final String MAP_LINKED_ASSET = "LinkedAsset";
    public static final String MAP_IEMI = "IMEI";
    public static final String MAP_IMSI = "IMSI";
    public static final String MAP_ICCID = "ICCID";

    // Service Constants
    public static final String TOKEN = "Token";
    public static final String USERNAME_EQUAL = "userName";
    public static final String PASSWORD_EQUAL = "Password";
    public static final String GRANT_TYPE = "grant_Type";
    public static final String CLIENT_ID = "client_Id";
    public static final String BEARER = "Bearer ";
    public static final String EXCEPTION_MESSAGE_LOG_SERVICE = "exception Happen in service because {}:";
    public static final String USER_ID = "userId";
    public static final String SEARCH_EQUAL = "search";
    public static final String URI_SCHEME = "http";
    public static final String ACCESS_TOKEN_ID = "accessTokenId";
    public static final String ASSET_PATH = "/api/viewAsset";
    public static final String ASSET_UPDATE_PATH = "/api/updateAssetStatus";
    public static final String ASSET_INSTALLATION_PATH = "/api/AssetInstallation";
    public static final String SUPPORT_ASSET_PATH = "/api/replacedamageasset";
    public static final String ASSET_LOCATION_PATH = "api/locationMaster";
    public static final String TOKEN_ED = "Tokened";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String MAX_RESPONSE_ID = "maxResponseId";
    public static final String OFFSET = "offset";
    public static final String LINK_ASSET_PATH = "/api/linkasset";
    public static final String ASSET_TRANSFER_IP_PATH = "/api/transfer";
    public static final String AGENT_CODE_EQUAL = "Agentcode";
    public static final String AGENT_CREDIT_PATH = "/api/agentcredit";
    public static final String ASSET_LIST_EXCEPTION_VALUE = "Invalid Request";

    private Constants() {}
}
