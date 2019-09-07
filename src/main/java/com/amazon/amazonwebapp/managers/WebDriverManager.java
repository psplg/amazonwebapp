package com.amazon.amazonwebapp.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.amazon.amazonwebapp.enums.DriverType;

public class WebDriverManager {
	private WebDriver webDriver;
	private static DriverType driverType;
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public WebDriver getDriver() {
		 if(webDriver == null) 
			 webDriver = createDriver();			 
		 
		 return webDriver;
		 }
	
	private WebDriver createDriver() {
		switch (driverType) {
		case CHROME:			
			webDriver= new ChromeDriver();
			break;

		case FIREFOX:
			webDriver= new FirefoxDriver();
			break;
		case INTERNETEXLPORER:		
			webDriver= new InternetExplorerDriver();
			break;
		default:
			webDriver= new ChromeDriver();
			break;
		}
		
		if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
			webDriver.manage().window().maximize();
		return webDriver;
	}
	
	public void quitDriver() {
		webDriver.close();
	}
	
}
