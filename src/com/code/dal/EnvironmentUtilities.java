package com.code.dal;

import java.util.ResourceBundle;

public class EnvironmentUtilities {
    private static String contextPath;
    private static String applicationPath;
    private static int serverPort;
    private static String serverIp;
    private static String portalUrl;
    private static String serverName;

    private static final ResourceBundle applicationConfig = ResourceBundle.getBundle("com.code.resources.config");
    private static ResourceBundle messages = ResourceBundle.getBundle("com.code.resources.messages");
    private static ResourceBundle arabicMessages = ResourceBundle.getBundle("com.code.resources.messages_ar");


    public static void setApplicationPath(String applicationPath) {
        EnvironmentUtilities.applicationPath = applicationPath;
    }

    public static String getApplicationPath() {
        return applicationPath;
    }

    public static void setServerPort(int serverPort) {
        EnvironmentUtilities.serverPort = serverPort;
    }

    public static void setServerIp(String serverIp) {
        EnvironmentUtilities.serverIp = serverIp;
    }

    public static String getServerInfo(){
        return "http://" + serverIp + ":" + serverPort;
    }

    public static String getAppConfigValue(String key) {
        return applicationConfig.getString(key);
    }

    public static String getMessageValue(String key){
        return messages.getString(key);
    }
 
    public static String getArabicMessagesValue(String key){
        return arabicMessages.getString(key);
    }
    
    public static void setContextPath(String contextPath) {
        EnvironmentUtilities.contextPath = contextPath;
    }

    public static String getContextPath() {
        return contextPath;
    }

	public static String getPortalUrl() {
		return portalUrl;
	}

	public static void setPortalUrl(String portalUrl) {
		EnvironmentUtilities.portalUrl = portalUrl;
	}
	
	public static String getServerName() {
		return serverName;
	}

	public static void setServerName(String serverName) {
		EnvironmentUtilities.serverName = serverName;
	}
}
