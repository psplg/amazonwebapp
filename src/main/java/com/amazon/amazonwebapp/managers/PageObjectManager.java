package com.amazon.amazonwebapp.managers;

import org.openqa.selenium.WebDriver;

import com.amazon.amazonwebapp.pageobject.HomePage;
import com.amazon.amazonwebapp.pageobject.LoginPage;

public class PageObjectManager {
	private WebDriver webDriver;
	private HomePage homePage;
	private LoginPage loginPage;

	public PageObjectManager(WebDriver webDriver) {		
		this.webDriver = webDriver;
	}

	public HomePage getHomePage() {
		return (homePage==null)?homePage=new HomePage(webDriver):homePage;
	}
	
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage =new LoginPage(webDriver):loginPage;
	}			
}
