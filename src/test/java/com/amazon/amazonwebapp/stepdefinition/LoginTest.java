package com.amazon.amazonwebapp.stepdefinition;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.amazonwebapp.cucumber.TestContext;
import com.amazon.amazonwebapp.managers.FileReaderManager;
import com.amazon.amazonwebapp.managers.PageObjectManager;
import com.amazon.amazonwebapp.managers.WebDriverManager;
import com.amazon.amazonwebapp.pageobject.HomePage;
import com.amazon.amazonwebapp.pageobject.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;

public class LoginTest {

	/*WebDriver webDriver;
	PageObjectManager pageObjectManager;*/
	TestContext testContext;
	HomePage homePage;
	LoginPage loginPage;
	
	public LoginTest(TestContext context) {
		testContext = context;
		
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	/*@Before
	public void setup() {		
		WebDriverManager webDriverManager = new WebDriverManager();
		webDriver = webDriverManager.getDriver();
		
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
	}*/
	
	/*@Given("^user is on Amazon home page")
	public void user_is_on_Amazon_home_page() {
	    //chromeDriver.get();	 
	    //webDriver.get(FileReaderManager.getInstance().getConfigReader().getBaseURL());
	    //testContext.getWebDriverManager().
	}*/	

	@And("^user enters username \"(.*)\"$")
	public void user_enters_username(String username) {
	    loginPage.enterUserName(username);
	}

	@And("^user enters password \"(.*)\"$")
	public void user_enters_password(String password) {
	    loginPage.enterPassword(password);
	}
	
	@When("^user enters incorrect username \"(.*)\"$")
	public void user_enters_incorrect_username(String invalidUsername) {
	    loginPage.enterUserName(invalidUsername);
	}

	@When("user enters incorrect password \"(.*)\"$")
	public void user_enters_incorrect_password(String invalidPassword) {
	    loginPage.enterPassword(invalidPassword);
	}
	
	
	@When("^user clicks signin$")
	public void user_clicks_signin() {
	    loginPage.clickSigInButton();
	}

	@Then("^user is redirected to user home page$")
	public void user_is_redirected_to_user_home_page() {
	    loginPage.checkURL();
	   // Assert.
	}
	
	@Then("^an error message \"(.*)\" is displayed$")
	public void an_error_message_is_displayed(String errorMessage)
	{		
		loginPage.validateErrorMessage(errorMessage);
		
	}
		
}
