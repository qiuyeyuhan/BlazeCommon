package com.bsb.consume.finance.enums;

import java.util.HashMap;
import java.util.Map;

public enum ENUMBlazeSourceCode {
	CONFIG("con00", "外部接口配置"), ADMIT("admit", "准入"), CREDIT("credit", "授信"), LOAN(
			"loan", "放款"), CREDITCONFIG("cre00", "征信查询"), CREDITMANU(
			"creditmanu", "授信人工回调"), LOANMANU("loanmanu", "放款人工回调");

	public static ENUMBlazeSourceCode toE_ExceptionCode(String code) {
		return codeMap.get(code);
	}

	public static String getNameByKey(String code) {
		ENUMBlazeSourceCode procResult = codeMap.get(code);
		if (procResult != null) {
			return procResult.getName();
		}
		return "";
	}

	private static Map<String, ENUMBlazeSourceCode> codeMap;
	private static Map<String, ENUMBlazeSourceCode> nameMap;

	private ENUMBlazeSourceCode(String code, String name) {
		this.code = code;
		this.name = name;
	}

	static {
		codeMap = new HashMap<String, ENUMBlazeSourceCode>();
		nameMap = new HashMap<String, ENUMBlazeSourceCode>();
		for (ENUMBlazeSourceCode procResult : ENUMBlazeSourceCode.values()) {
			codeMap.put(procResult.getCode(), procResult);
			nameMap.put(procResult.getName(), procResult);
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
		return this.getCode();
	}

}
