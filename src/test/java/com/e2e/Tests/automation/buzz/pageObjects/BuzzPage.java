package com.e2e.Tests.automation.buzz.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuzzPage {
	/*Location*/
	final static String USER_Mind_ID = "createPost_content";
	final static String USER_Buzz_ID = "menu_buzz_viewBuzz";
	final static String USER_Post_ID = "postSubmitBtn";
	/*@FindBy*/
	@FindBy(how = How.ID,using= USER_Mind_ID)
	public static WebElement mind;
	@FindBy(how = How.ID,using= USER_Buzz_ID)
	public static WebElement buzz;	
	@FindBy(how = How.ID,using= USER_Post_ID)
	public static WebElement post;
	
	public void fillUserMind(String name) {
		mind.sendKeys(name);
	}
	
	public void clickBtnBuzz() {
		buzz.click();
	}
	public void clickBtnPost() {
		post.click();
	}

}
