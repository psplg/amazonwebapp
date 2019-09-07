package com.amazon.amazonwebapp.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver webDriver;	
	
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath="//*[@id=\'nav-link-accountList\']/span[1]")
	private WebElement loginOption;

	public void goToToHomePage(String baseURL)
	{
		webDriver.get(baseURL);
	}
	
	public void clickLogin() {
		//actions.moveToElement(loginOption).click().build().perform();
		loginOption.click();
	}
}
