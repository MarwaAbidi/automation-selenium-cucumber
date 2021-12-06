package com.e2e.Tests.automation.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	
	public static WebDriver driver;
	static DriverManager driverManger;
	@Before
	/** 
	 * Call browser with the design pattern
	 */
	public static void setup() {
		driverManger = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManger.getDriver();
	}
	@After
	/**
	 * 
	 * embedScreenShot is test if test is marked as failed
	 */
	public void embedScreenShot(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
			try {
				scenario.write("Current page URL is " + driver);
				byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}catch (WebDriverException somePlatformDontSupportScreenshots) {
				System.err.println(somePlatformDontSupportScreenshots);
			}
			
		}
		driver.quit();
		
	}
}
