package com.stepdefinition;

import java.io.IOException;

import com.pages.Searchbyfeatures;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchbyfeatures_def
{
	Searchbyfeatures sf=new Searchbyfeatures();
			Searchbyfeatures s=new Searchbyfeatures();
	@Given("^Open the site url in browser$")
	public void open_the_site_url_in_browser()  {
		sf.launchy();

		// Write code here that turns the phrase above into concrete actions

	}

	@When("^the user search the product by size,color$")
	public void the_user_search_the_product_by_size_color() 
	{
		sf.mouseactions();
		sf.sizecolour();
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^the user search the product by compositions,style$")
	public void the_user_search_the_product_by_compositions_style()  {
		// Write code here that turns the phrase above into concrete actions
		sf.stylecomposition(); 
	}

	@Then("^products are displayed$")
	public void products_are_displayed() throws IOException, InterruptedException  {
		sf.Screenshot2();
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		sf.Close();
	}






}
