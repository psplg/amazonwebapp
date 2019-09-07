package com.amazon.amazonwebapp.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSLoginPage {

	private WebDriver webDriver; 
	public OpenMRSLoginPage(WebDriver webDriver)
	{
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//*[@id='username']")
	private WebElement userNameTextBox;
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement userPasswordTextBox;
	
	@FindBy(xpath = "//*[@id='Inpatient Ward']")
	private WebElement locationSession;
	
	@FindBy(xpath = "//*[@id='loginButton']")
	private WebElement loginButton;

}
