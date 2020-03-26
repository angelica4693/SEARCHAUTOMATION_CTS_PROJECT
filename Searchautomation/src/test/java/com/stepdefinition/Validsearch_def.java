package com.stepdefinition;

import java.io.IOException;

import com.pages.ValidSearch;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Validsearch_def
{
	ValidSearch v=new ValidSearch();
	
	@Given("^Open the URL in browser$")
	public void open_the_URL_in_browser() 
	{
	    v.launchy("chrome") ;
	    v.launchsite();

	}
	

	@When("^Enter the valid value in Search option$")
	public void enter_the_valid_value_in_Search_option()  
	{
		v.entervalue();
	 
	}
	

	@Then("^Click on enter$")
	public void click_on_enter() throws IOException, InterruptedException
	{
		v.TapEnter();
		v.Screenshot2();
	   Thread.sleep(4000);
		v.Close();
	}

}


