package com.code.enums;

public enum ModuleCodeEnum {

	DocumentRichEditor("DocumentRichEditor");

	private String code;

	private ModuleCodeEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
