package com.e2e.Tests.automation.authertication.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutherticationPage {
	/*Location*/
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String USER_LOGIN_ID = "btnLogin";
	/*@FindBy*/
	@FindBy(how = How.ID,using= USER_NAME_ID)
	public static WebElement username;
	@FindBy(how = How.ID,using= USER_PASSWORD_ID)
	public static WebElement pwd;	
	@FindBy(how = How.ID,using= USER_LOGIN_ID)
	public static WebElement login;
	
	public void fillUserName(String name) {
		username.sendKeys(name);
	}
	
	public void fillUserPassword(String password) {
		pwd.sendKeys(password);
	}
	public void clickBtnLogin() {
		login.click();
	}

}
