package com.amazon.amazonwebapp.cucumber;

import com.amazon.amazonwebapp.managers.PageObjectManager;
import com.amazon.amazonwebapp.managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {		
		this.webDriverManager = new WebDriverManager();
		this.pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	
}
