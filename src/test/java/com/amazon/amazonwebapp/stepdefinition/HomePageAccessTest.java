package com.amazon.amazonwebapp.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.amazonwebapp.cucumber.TestContext;
import com.amazon.amazonwebapp.managers.FileReaderManager;
import com.amazon.amazonwebapp.pageobject.HomePage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageAccessTest {

	WebDriver chromeDriver;
	HomePage homePage;
	TestContext testContext;
	
	public HomePageAccessTest(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^user is on Amazon home page")
	public void user_is_on_Amazon_home_page() {
	    //chromeDriver.get();	 
	    //webDriver.get(FileReaderManager.getInstance().getConfigReader().getBaseURL());
	    //testContext.getWebDriverManager().
		homePage.goToToHomePage(FileReaderManager.getInstance().getConfigReader().getBaseURL());
	}
	
	@Given("^user has launched the browser$")
	public void user_has_launched_the_browser() {
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() {
		/*pageObjectManager = new PageObjectManager(webDriver);
		loginPage = pageObjectManager.getLoginPage();*/
	    homePage.clickLogin();
	}
	
	@When("^user enters \"(.*)\"$")
	public void user_enters(String string) {
	    chromeDriver.get(string);
	    Actions actions;
	    //actions.
	    
	}

	@Then("^user should be \"(.)*\"$")
	public void user_should_be(String string) {
		String expectedVal = " Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	    System.out.println("Title is:\n "+chromeDriver.getTitle()+"\n");
		assertFalse(string.equals(expectedVal));		
	}
}
