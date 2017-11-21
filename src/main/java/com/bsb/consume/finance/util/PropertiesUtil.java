package com.bsb.consume.finance.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;


/**
 * 读取系统配置文件
 */
public class PropertiesUtil {
	static Logger logger = Logger.getLogger(PropertiesUtil.class);
	private static Properties properties = null;
	private static long lastModified = 0;
	public static synchronized Properties getProperties() throws FileNotFoundException {
		try {
			if(properties == null||isModified()) {
				properties = new Properties();
				InputStream third = PropertiesUtil.class.getResourceAsStream("/third.properties");
				InputStream dataplatform = PropertiesUtil.class.getResourceAsStream("/dataplatform.properties");
				InputStream is = new FileInputStream("/home/bsbview/bsb/consume/config/config.properties");
				BufferedReader bf = new BufferedReader(new InputStreamReader(third, "UTF-8"));
				BufferedReader bf2 = new BufferedReader(new InputStreamReader(dataplatform, "UTF-8"));
				BufferedReader bf3 = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				try {
					properties.load(bf);
					properties.load(bf2);
					properties.load(bf3);
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return properties;
	}
	//文件是否修改
	public static boolean isModified(){
		boolean flag = false;
		File file = new File("/home/bsbview/bsb/consume/config/config.properties");
		if (file.lastModified()>lastModified) {
			lastModified = file.lastModified();
			flag = true;
		}
		return flag;
	}
}
