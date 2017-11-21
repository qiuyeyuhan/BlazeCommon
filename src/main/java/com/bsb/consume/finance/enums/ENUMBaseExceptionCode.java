package com.bsb.consume.finance.enums;

import java.util.HashMap;
import java.util.Map;

public enum ENUMBaseExceptionCode {

	BASE_ERR_001("BASE_ERR_001", "字段为空");
	
	public static ENUMBaseExceptionCode toE_ExceptionCode(String code) {
		return codeMap.get(code);
	}
	
	public static String getNameByKey(String code) {
		ENUMBaseExceptionCode procResult  = codeMap.get(code);
		if (procResult  != null) {
			return procResult .getName();
		}
		return "";
	}

	private static Map<String, ENUMBaseExceptionCode> codeMap;
	private static Map<String, ENUMBaseExceptionCode> nameMap;

	private ENUMBaseExceptionCode(String code, String name) {
		this.code = code;
		this.name = name;
	}

	static {
		codeMap = new HashMap<String, ENUMBaseExceptionCode>();
		nameMap = new HashMap<String, ENUMBaseExceptionCode>();
		for ( ENUMBaseExceptionCode procResult  : ENUMBaseExceptionCode.values()) {
			codeMap.put(procResult .getCode(), procResult );
			nameMap.put(procResult .getName(), procResult );
		}
	}
	private String code;
	private String name;
	public boolean equals(String code) {
		return this.getCode().equals(code);
	}
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return this.getCode() ;
	}
}
