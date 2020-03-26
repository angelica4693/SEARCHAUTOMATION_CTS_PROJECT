package com.stepdefinition;

import java.io.IOException;

import com.pages.Relatedsearch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Relatedsearch_def
{
	 Relatedsearch rs=new Relatedsearch();
	@Given("^Open the website url in browser$")
	public void open_the_website_url_in_browser()  {
		rs.launchy() ;
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^Enter the partial value in search option$")
	public void enter_the_partial_value_in_search_option() {
		rs.relatedsearch();
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Suggestions are displayed under search tab$")
	public void suggestions_are_displayed_under_search_tab() throws IOException, InterruptedException {
		rs.clickrelatedsearch();
		rs.Screenshot2();
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		rs.Close();  
	}

}
