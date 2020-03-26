package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relatedsearch 
{
	WebDriver d;
	By locator=By.xpath("//*[@id=\"search_query_top\"]");
	By locator1=By.xpath("//*[@id=\"searchbox\"]/button");
	By relatedresult=By.xpath("//*[@id=\"index\"]/div[2]/ul/li[2]");

	//launching the browser
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
		d.get("http://automationpractice.com/index.php");
	}
	
	//launching the website
	
	public void launchsite()
	{
		d.get("http://automationpractice.com/index.php");
		System.out.println(d.getTitle());
	}
	//Methods for executing related searches in the site

	public void relatedsearch()
	{
		d.findElement(locator).click();
		d.findElement(locator).sendKeys("dres");
	}

	public void clickrelatedsearch()
	{
		d.findElement(relatedresult).click();
	}

	public void Screenshot2() throws IOException
	{
		TakesScreenshot t = (TakesScreenshot)d;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\git\\SEARCHAUTOMATION_CTS_PROJECT\\Searchautomation\\src\\test\\resources\\Screenshots\\Screenshots4.png"));
	}

	public void Close()
	{
		d.close();
	}
}
