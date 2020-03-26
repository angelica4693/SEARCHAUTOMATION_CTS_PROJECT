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

public class ValidSearch 
{
	WebDriver d;
	By locator=By.xpath("//*[@id=\"search_query_top\"]");
	By locator1=By.xpath("//*[@id=\"searchbox\"]/button");
	public void launchy() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.get("http://automationpractice.com/index.php");
	}

	public void entervalue()
	{
		d.findElement(locator).sendKeys("shirt");
	}
	public void TapEnter()
	{
		
		d.findElement(locator1).click();
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,600)");
		
	}
	public void Screenshot2() throws IOException
	{
		TakesScreenshot t = (TakesScreenshot)d;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\sharo\\Downloads\\Searchautomation\\src\\test\\resources\\Screenshots\\Screenshots.png"));
	}
	public void Close()
	{
		d.close();
	}
	}




