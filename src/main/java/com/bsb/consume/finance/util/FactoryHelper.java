package com.bsb.consume.finance.util;

import java.io.IOException;

import com.blazesoft.server.local.NdLocalServerException;
import com.bsb.consume.finance.blaze.service.Server;

public class FactoryHelper {
	private FactoryHelper() {

	}
	//查询数据平台客户端
	// blaze-Server类实例
	private static Server creditconfigServer = null;
	private static Server extConfigServer = null;
	private static Server admitServer = null;
	private static Server creditServer = null;
	private static Server loanServer = null;
	private static Server creditManuServer = null;
	private static Server loanManuServer = null;
	

	public static Server getCreditConfigServer() throws IOException,
			NdLocalServerException {
		if (creditconfigServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("creditconfigserver");
			creditconfigServer = (Server) Server
					.createServer(blazeServerCofingPath);
		}
		return creditconfigServer;
	}

	public static Server getExtConfigServer() throws IOException,
			NdLocalServerException {
		if (extConfigServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("extconfigserver");
			extConfigServer = (Server) Server
					.createServer(blazeServerCofingPath);
		}
		return extConfigServer;
	}

	public static Server getAdmitServer() throws IOException,
			NdLocalServerException {
		if (admitServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("admitserver");
			admitServer = (Server) Server.createServer(blazeServerCofingPath);
		}
		return admitServer;
	}

	public static Server getCreditServer() throws IOException,
			NdLocalServerException {
		if (creditServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("creditserver");
			creditServer = (Server) Server.createServer(blazeServerCofingPath);
		}
		return creditServer;
	}

	public static Server getLoanServer() throws IOException,
			NdLocalServerException {
		if (loanServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("loanserver");
			loanServer = (Server) Server.createServer(blazeServerCofingPath);
		}
		return loanServer;
	}

	public static Server getCreditManuServer() throws IOException,
			NdLocalServerException {
		if (creditManuServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("creditmanuserver");
			creditManuServer = (Server) Server
					.createServer(blazeServerCofingPath);
		}
		return creditManuServer;
	}

	public static Server getLoanManuServer() throws IOException,
			NdLocalServerException {
		if (loanManuServer == null) {
			String blazeServerCofingPath = SystemPropertiesUtil.getProperties()
					.getProperty("loanmanuserver");
			loanManuServer = (Server) Server
					.createServer(blazeServerCofingPath);
		}
		return loanManuServer;
	}
}
