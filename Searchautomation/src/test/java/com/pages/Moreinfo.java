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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Moreinfo
{
	WebDriver d;
	By firstpoint=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
	By more_option=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span");


	// for launching the browser and website

	public void launchy(String browser) 
	{
		// for launching chrome browser 

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
	//Method to open desired page on Website

	public void launchpage()
	{
		d.get("http://automationpractice.com/index.php");
		System.out.println(d.getTitle());
	}
	public void mouseactions()
	{
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,600)");
		WebElement a1= d.findElement(firstpoint);
		WebElement a2=d.findElement(more_option);
		Actions act = new Actions(d);
		act.moveToElement(a1);
		act.moveToElement(a2).click().build().perform();

	}
	//taking the screenshot
	public void Screenshot2() throws IOException
	{
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,800)");
		TakesScreenshot t = (TakesScreenshot)d;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\git\\SEARCHAUTOMATION_CTS_PROJECT\\Searchautomation\\src\\test\\resources\\Screenshots\\Screenshots5.png"));
	}

	public void Close()
	{
		d.close();
	}
}
