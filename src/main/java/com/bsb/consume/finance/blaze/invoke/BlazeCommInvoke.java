package com.bsb.consume.finance.blaze.invoke;

import com.bsb.consume.finance.blaze.service.RuleRunner;
import com.bsb.consume.finance.enums.ENUMBlazeSourceCode;

public class BlazeCommInvoke {
	public String invoke(String sourceCode, String blazeBom) throws Exception {
		RuleRunner ruleRunner = new RuleRunner();
		String blazeResponse = "";
		if (ENUMBlazeSourceCode.CREDITCONFIG.getCode().equals(sourceCode)) {
			blazeResponse = ruleRunner.creditConfig(blazeBom);
		} else {
			if (ENUMBlazeSourceCode.CONFIG.getCode().equals(sourceCode)) {
				blazeResponse = ruleRunner.extConfig(blazeBom);
			} else {
				if (ENUMBlazeSourceCode.ADMIT.getCode().equals(sourceCode)) {
					blazeResponse = ruleRunner.admit(blazeBom);
				} else {
					if (ENUMBlazeSourceCode.CREDIT.getCode().equals(sourceCode)) {
						blazeResponse = ruleRunner.credit(blazeBom);
					} else {
						if (ENUMBlazeSourceCode.LOAN.getCode().equals(
								sourceCode)) {
							blazeResponse = ruleRunner.loan(blazeBom);
						} else {
							if (ENUMBlazeSourceCode.CREDITMANU.getCode()
									.equals(sourceCode)) {
								blazeResponse = ruleRunner.creditmanu(blazeBom);
							} else {
								if (ENUMBlazeSourceCode.LOANMANU.getCode()
										.equals(sourceCode)) {
									blazeResponse = ruleRunner
											.loanmanu(blazeBom);
								}
							}
						}
					}
				}
			}
		}
		return blazeResponse;
	}

	public String resetService(String sourceCode) throws Exception {
		RuleRunner ruleRunner = new RuleRunner();
		String blazeResponse = "";
		if (ENUMBlazeSourceCode.CREDITCONFIG.getCode().equals(sourceCode)) {// 重置征信查询
			blazeResponse = ruleRunner.resetCreditConfigADBService();
		} else {
			if (ENUMBlazeSourceCode.CONFIG.getCode().equals(sourceCode)) {
				blazeResponse = ruleRunner.resetExtConfigADBService();
			} else {
				if (ENUMBlazeSourceCode.ADMIT.getCode().equals(sourceCode)) {
					blazeResponse = ruleRunner.resetAdmitADBService();
				} else {
					if (ENUMBlazeSourceCode.CREDIT.getCode().equals(sourceCode)) {
						blazeResponse = ruleRunner.resetCreditADBService();
					} else {
						if (ENUMBlazeSourceCode.LOAN.getCode().equals(
								sourceCode)) {
							blazeResponse = ruleRunner.resetLoanADBService();
						} else {
							if (ENUMBlazeSourceCode.CREDITMANU.getCode()
									.equals(sourceCode)) {
								blazeResponse = ruleRunner
										.resetCreditManuADBService();
							} else {
								if (ENUMBlazeSourceCode.LOANMANU.getCode()
										.equals(sourceCode)) {
									blazeResponse = ruleRunner
											.resetLoanManuADBService();
								}
							}
						}
					}
				}
			}
		}

		return blazeResponse;
	}
}
