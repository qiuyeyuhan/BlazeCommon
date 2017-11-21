package com.bsb.consume.finance.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;


/**
 * 读取系统配置文件
 */
public class SystemPropertiesUtil {
	static Logger logger = Logger.getLogger(SystemPropertiesUtil.class);
	private static Properties properties = null;
	public static synchronized Properties getProperties() throws FileNotFoundException {
			
		try {
			if(properties == null) {
				properties = new Properties();
				InputStream is =SystemPropertiesUtil.class.getResourceAsStream("/systemcomm.properties");
				BufferedReader bf = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				try {
					properties.load(bf);
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return properties;
	}
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(SystemPropertiesUtil.getProperties().getProperty("creditconfigserver"));
		String bankName = SystemPropertiesUtil.getProperties().getProperty("unioncard");
		System.out.println(bankName);
		String banks[] = bankName.split("\\|");
		System.out.println(banks);
	}
}
