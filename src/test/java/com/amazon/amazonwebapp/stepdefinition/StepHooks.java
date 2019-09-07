package com.amazon.amazonwebapp.stepdefinition;

import com.amazon.amazonwebapp.cucumber.TestContext;
import com.amazon.amazonwebapp.pageobject.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepHooks {

	TestContext testContext;
	//HomePage homePage;
	public StepHooks(TestContext context) {
		// TODO Auto-generated constructor stub
		testContext = context;
	}
	
	/*@Before
	public HomePageAccessTest(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}*/
	
	@After
	public void tearDown()
	{
		System.out.println("Closing driver");
		try {
			//webDriver.close();
			testContext.getWebDriverManager().quitDriver();
		}
		catch(NullPointerException npe)
		{
			System.out.println("WebDriver not initialized");
		}
	}

}
