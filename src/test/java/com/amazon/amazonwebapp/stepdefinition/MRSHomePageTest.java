package com.amazon.amazonwebapp.stepdefinition;

import java.util.Iterator;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Then;

public class MRSHomePageTest {

	@Given("user is logged in to MRS app")
	public void user_is_logged_in_to_MRS_app(DataTable userCredentials) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
	   // Map<Object, Object> userCredentialsMap;
	    for(Map<Object, Object> userCredentialsMap:userCredentials.asMaps(String.class, String.class))
	    {
	    	
	    	userCredentialsMap.get("username");
	    	userCredentialsMap.get("password");
	    }
		userCredentials.asMaps();
	}

	//\"(.*)\"$"
	@When("user clicks on option \"(.*)\"$")
	public void user_clicks_on_option(String location) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@And("user clicks on Manage Service Types")
	public void user_clicks_on_Manage_Service_Types() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("clicks on Apppoinment Scheduling")
	public void clicks_on_Apppoinment_Scheduling() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("^user is navigated to \"(.*)\" page$")
	public void user_is_navigated_to_title_page(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}
	
	@And("^user clicks on Inpatient Ward$")
	public void user_clicks_on_Inpatient_Ward() {
	    // Write code here that turns the phrase above into concrete actions	 
	}
	
	@And("^user clicks on Apppoinment Scheduling$")
	public void user_clicks_on_Apppoinment_Scheduling() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("user should be able to view a tabular list of Services")
	public void user_should_be_able_to_view_a_tabular_list_of_Services() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
}
