package com.testData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFileUse {

	
 public static String propertiesfile (String value) throws IOException {
		
		Properties prop = new Properties();
	     
 FileInputStream  fis = new FileInputStream(System.getProperty("user.dir") + "//dalalStreet.properties");
	     
	 prop.load(fis);
	     
	return prop.getProperty(value);
	     
	  
	     
	     
	}
}
