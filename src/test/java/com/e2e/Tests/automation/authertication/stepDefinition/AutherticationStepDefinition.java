package com.e2e.Tests.automation.authertication.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2e.Tests.automation.authertication.pageObjects.AutherticationPage;
import com.e2e.Tests.automation.util.CommonMethods;
import com.e2e.Tests.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutherticationStepDefinition {
	
	public  WebDriver driver;
	private AutherticationPage autherticationPage =new AutherticationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AutherticationStepDefinition () {
		
		driver = Setup.driver;
		PageFactory.initElements(driver,AutherticationPage.class );
	}
	@Given("^Je me connecter sur l'application Orange HRM$")
	public void JeMeConnecterSurLApplicationOrangeHRM() throws Throwable {
	 
	 commonMethods.ReadFromFile("url");
	}

	@When("^Je saisie le UserName \\\"([^\\\"]*)\\\"$")
	public void JeSaisieLeUserName(String name) throws Throwable {
		
		autherticationPage.fillUserName(name);
		
	}

	@When("^Je saisie le mot de passe \\\"([^\\\"]*)\\\"$")
	public void JesaisieLeMotDePasse(String password) throws Throwable {
		autherticationPage.fillUserPassword(password);
	}

	@When("^Je clique sur le buton Login$")
	public void JeCliqueSurLeButonLogin() throws Throwable {
		autherticationPage.clickBtnLogin();
	    
	}

	@Then("^Je me redirige vers la page Home$")
	public void JeMeRedirigeVersLaPageHome() throws Throwable {
	    
	}

}
