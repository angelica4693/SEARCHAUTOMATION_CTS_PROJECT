package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidSearch 
{
	WebDriver d;
	By locator=By.xpath("//*[@id=\"search_query_top\"]");
	By locator1=By.xpath("//*[@id=\"searchbox\"]/button");

	//Launching browser and website

	public void launchy(String browser) 

	{

		if(browser.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\SEARCHAUTOMATION_CTS_PROJECT\\Searchautomation\\src\\test\\resources\\Drivers\\chromedriver.exe");
			d =new ChromeDriver();
		}

		// for launching firefox browser

		else if(browser.equalsIgnoreCase("firefox"))

		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\git\\SEARCHAUTOMATION_CTS_PROJECT\\Searchautomation\\src\\test\\resources\\Drivers\\geckodriver.exe");
			d=new FirefoxDriver();
		}

		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		
	}
	
	//Method to open desired page on website
	public void launchsite()
	{
		d.get("http://automationpractice.com/index.php");
		System.out.println(d.getTitle());
		
	}
	
	//Searching for a product
	public void entervalue()
	{
		d.findElement(locator).sendKeys("shirt");
	}
	public void TapEnter()
	{

		d.findElement(locator1).click();
		JavascriptExecutor j = (JavascriptExecutor)d;//scrolling down the pages
		j.executeScript("window.scrollBy(0,600)");

	}
	//Taking screenshots

	public void Screenshot2() throws IOException
	{
		TakesScreenshot t = (TakesScreenshot)d;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\git\\SEARCHAUTOMATION_CTS_PROJECT\\Searchautomation\\src\\test\\resources\\Screenshots\\Screenshots.png"));
	}

	public void Close()
	{
		d.close();
	}
}




