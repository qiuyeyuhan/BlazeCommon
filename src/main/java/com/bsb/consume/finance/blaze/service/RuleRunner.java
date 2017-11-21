package com.bsb.consume.finance.blaze.service;

import java.io.IOException;

import com.blazesoft.server.base.NdServerException;
import com.blazesoft.server.base.NdServiceException;
import com.blazesoft.server.base.NdServiceSessionException;
import com.blazesoft.server.local.NdLocalServerException;
import com.bsb.consume.finance.util.FactoryHelper;

public class RuleRunner {
	public String creditConfig(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getCreditConfigServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	public String extConfig(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getExtConfigServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	public String admit(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getAdmitServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	public String credit(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getCreditServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	public String loan(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getLoanServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	public String creditmanu(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getCreditManuServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	public String loanmanu(String xml) throws NdServiceSessionException,
			NdServiceException, NdServerException, IOException {
		String responseString = null;
		Server server = FactoryHelper.getLoanManuServer();
		responseString = server.invoke(xml);
		return responseString;
	}

	// 重新加载creditConfigADB
	public String resetCreditConfigADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getCreditConfigServer();
		return server.resetADBService();
	}

	// 重新加载extConfigADB
	public String resetExtConfigADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getExtConfigServer();
		return server.resetADBService();
	}

	// 重新加载admitADB
	public String resetAdmitADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getAdmitServer();
		return server.resetADBService();
	}

	// 重新加载creditADB
	public String resetCreditADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getCreditServer();
		return server.resetADBService();
	}

	// 重新加载loanADB
	public String resetLoanADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getLoanServer();
		return server.resetADBService();
	}

	// 重新加载creditManuADB
	public String resetCreditManuADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getCreditManuServer();
		return server.resetADBService();
	}

	// 重新加载loanManuADB
	public String resetLoanManuADBService() throws NdLocalServerException,
			IOException {
		Server server = FactoryHelper.getLoanManuServer();
		return server.resetADBService();
	}
}
