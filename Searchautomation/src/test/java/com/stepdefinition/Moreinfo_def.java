package com.stepdefinition;

import java.io.IOException;

import com.pages.Moreinfo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Moreinfo_def
{
	Moreinfo mi=new Moreinfo();

	@Given("^Open the web url in the  browser$")
	public void open_the_web_url_in_the_browser()
	{
		mi.launchy("chrome");
		mi.launchpage();
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^the user clicks the more button$")
	public void the_user_clicks_the_more_button()  
	{
		// Write code here that turns the phrase above into concrete actions

		mi.mouseactions();

	}

	@Then("^the website navigates to the next page and displays the additional information$")
	public void the_website_navigates_to_the_next_page_and_displays_the_additional_information() throws IOException, InterruptedException  
	{
		// Write code here that turns the phrase above into concrete actions
		mi.Screenshot2();
		Thread.sleep(4000);
		mi.Close();  
	}


}
