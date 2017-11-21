//
// Blaze Advisor Server Deployment.
// Created by the Blaze Advisor Generate Deployment Wizard
//
// Copyright (1997-2014),Fair Isaac Corporation. All Rights Reserved.
// 
//

package com.bsb.consume.finance.blaze.service;

import java.net.InetAddress;

import com.blazesoft.server.base.NdServerException;
import com.blazesoft.server.base.NdServiceException;
import com.blazesoft.server.base.NdServiceSessionException;
import com.blazesoft.server.config.NdServerConfig;
import com.blazesoft.server.deploy.NdStatelessServer;
import com.blazesoft.server.local.NdLocalServerException;

//==> Import Application specific code here

/**
 *	This class implements a stateless server based on BsbDmApproveRuleService
 *	It is a subclass of <code>com.blazesoft.server.deploy.NdStatelessServer</code>.
 */
public class Server extends NdStatelessServer

{
	/**
	 *	Constructor. Calls the constructor of the superclass.
	 *	@param	serverConfig	Server configuration to use
	 *
 	 *	@exception NdLocalServerException if construction of the server fails.
	 */
	public Server(NdServerConfig serverConfig)
			throws NdLocalServerException
	{
		super(serverConfig);
	}

	/**
	 *	Invokes a server through the entry point "invokeExternalMain"
	 *	in the service "BsbDmApproveRuleService".
	 *
	 *	@param	arg0		==> Enter a description here
	 *	@return	String	==> Enter a description of the return value
	 */
	public String invoke(String arg0)
			throws NdServerException, NdServiceException, NdServiceSessionException
	{
		// Build the argument list
		Object[] applicationArgs = new Object[1];
		applicationArgs[0] = arg0;
			

		// Invoke the service and returns its result, if any.
		String retVal = (String)invokeService("CommonRuleService", "invokeExternalMain", null, applicationArgs);
		return retVal;
	}
	
	public String resetADBService() throws NdLocalServerException{
		this.resetService("CommonRuleService");
		//获取本机ip地址
		String ip = "";
		String name = "";
		try {
			InetAddress address = InetAddress.getLocalHost();
			ip = address.getHostAddress().toString();
			name = address.getHostName().toString();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		return "IP: "+ip +" hostName: "+name +" Invoke SUCCESS";
	}
}
