package com.code.enums;

public enum SessionAttributesEnum {
    CURRENT_LANG("curLang"),

    USER_DATA("employeeData"),
    
    USER_REQUESTS_MENU("userRequestsMenu"),
    USER_YARD_TRANSACTIONS_MENU("userYardTransactionsMenu"),
    USER_WAREHOUSE_TRANSACTIONS_MENU("userWarehouseTransactionsMenu"),
    USER_GASOLINE_TRANSACTIONS_MENU("userGasolineTransactionsMenu"),
    USER_CONTRACT_TRANSACTIONS_MENU("userContractTransactionsMenu"),
    USER_RETURN_TRANSACTIONS_MENU("userReturnTransactionsMenu"),
    USER_CUSTODIES_MENU("userCustodiesMenu"),
    
    USER_INQUIRIES_MENU("userInquiriesMenu"),
    USER_REPORTS_MENU("userReportsMenu"),
    USER_SETUPS_MENU("userSetupsMenu"),
    USER_GENERAL_MENU("userGeneralMenu"),
    USER_CONFIG_MENU("userConfigMenu"),
    USER_INTERNAL_MENU("userInternalMenu")
    ;

    private String code;

    private SessionAttributesEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

   