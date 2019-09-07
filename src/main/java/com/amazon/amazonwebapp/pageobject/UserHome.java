package com.amazon.amazonwebapp.pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHome {

	public UserHome(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath="//*[@id='nav-search-submit-text']")
	private WebElement searchBox;
	
	@FindBy(xpath="//*[@id='nav-link-accountList']//span[text()='Hello, Puneet']")
	private WebElement welcomeMsgLabel;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getWelcomeMsgLabel() {
		return welcomeMsgLabel;
	}

	public void verifyUserName()
	{
		String expected = "Hello, Puneet";
		String actual = getWelcomeMsgLabel().getText();		
	}
}
