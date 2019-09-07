package com.amazon.amazonwebapp.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/amazon/amazonwebapp/feature",
		glue= {"com.amazon.amazonwebapp.stepdefinition"},
		monochrome=true,
		tags= {"@MRSTest"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
						 "junit:target/cucumber-reports/Cucumber.xml",
						 "html:target/cucumber-reports"}
		,dryRun=true		
		)
public class RunTest {
	
}
