package com.msn.sma.lib.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Param {
	
	private static Param paramIns;
	private static String url;
	private static String port;
	private static String version;
	
   
    private Param() {
        this.url = url;
        this.port = port;
        this.version = version;
    }
	private static void setUrl(String url) {
		Param.url = url;
	}
	private static void setPort(String port) {
		Param.port = port;
	}
	private static void setVersion(String version) {
		Param.version = version;
	}
	
	
   public static synchronized Param getInstance() {
	    	
	        if (paramIns == null) {
	        	paramIns = new Param();
	            	ClassLoader classloader = Thread.currentThread().getContextClassLoader();
	        		InputStream is = classloader.getResourceAsStream("application.properties");
	        		Properties prop = new Properties();
	        		 try {
	        			prop.load(is);
	                    paramIns.setUrl(prop.getProperty(ParamKey.url));
	                    paramIns.setPort(prop.getProperty(ParamKey.port));
	                    paramIns.setVersion(prop.getProperty(ParamKey.version));
	        		} catch (IOException e) {
	        			e.printStackTrace();
	        		}
	        }
	        
	        return paramIns;
	        
	}
	public static String getUrl() {
		return url;
	}
	public static String getPort() {
		return port;
	}
	public static String getVersion() {
		return version;
	}
    
}
