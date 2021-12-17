package com.e2e.Tests.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonMethods {
	
	public static Properties prop;
	
public void ReadFromFile(String url) throws IOException  {
	prop = new Properties ();
	FileInputStream fis = new FileInputStream ("/framework-cucumber-seleium/src/test/resources/config/config.properties");
	prop.load(fis);
	Setup.driver.get(prop.getProperty(url));
	
}




}
