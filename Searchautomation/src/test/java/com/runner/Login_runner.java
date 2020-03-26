package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\resources\\Feature\\search.feature",
				plugin= {"pretty","html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
        "com.cucumber.listener.ExtentCucumberFormatter:reports/report.html"},
		tags= {"@TC_01,@TC_02,@TC_03,@TC_04,@TC_05"},
		glue= {"com.stepdefinition"},
		monochrome=true
		)
public class Login_runner
{
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}