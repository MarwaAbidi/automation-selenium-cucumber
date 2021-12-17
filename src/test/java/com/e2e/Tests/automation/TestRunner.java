package com.e2e.Tests.automation;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		//glue = {"com.e2e.Tests.automation"},
		plugin = {"pretty" , "html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeReport.html"},
		
		snippets = SnippetType.CAMELCASE,
		tags = {("@Cnx")},
		monochrome = true
		
		)
public class TestRunner {
    @AfterClass
	public static void WriteExtentReport (){
		Reporter.loadXMLConfig(new File("/framework-cucumber-seleium/src/test/resources/config/extent-config.xml"));;
		
	}
	
}
