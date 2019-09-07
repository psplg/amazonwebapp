package com.amazon.amazonwebapp.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginPage {

	private WebDriver webDriver;
	//private Actions actions;
	public LoginPage(WebDriver webDriver) {		
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}		
	
	@FindBy(xpath="//*[@id=\'ap_email\']")
	private WebElement usernameTextBox;
	
	@FindBy(xpath="//*[@id=\'ap_password\']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//*[@id=\'signInSubmit\']")
	private WebElement signInButton;

	@FindBy(xpath="//*[contains(text(), 'incorrect')]")	
	private WebElement errorLabel;		

	public void enterUserName(String username) {
		usernameTextBox.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}

	public void clickSigInButton() {
		signInButton.submit();
	}

	public void checkURL() {		
		String URL = webDriver.getCurrentUrl();
		System.out.println("URL is: "+URL);
	}

	public void validateErrorMessage(String errorMessage) {
		// TODO Auto-generated method stub
		String genertedError= errorLabel.getText();
		isMatching(errorMessage,genertedError);
		System.out.println("matched & returned from method");
	}

	//@Test
	private void isMatching(String expectedError, String errorMessage) {
		// TODO Auto-generated method stub
		System.out.println("Generated "+expectedError);
		try {
			assertEquals("Expected Error generated",expectedError, errorMessage);
		}
		catch(Exception e)
		{
			System.out.println("Mismatch catched here");
		}
	}
	
	
}
