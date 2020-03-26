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

public class Searchbyfeatures
{
	WebDriver d;

	By women=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By tshirts=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
	By size=By.xpath("//*[@id=\"layered_id_attribute_group_2\"]");
	By color=By.xpath("//*[@id=\"layered_id_attribute_group_14\"]");
	By composition=By.xpath("//*[@id=\"layered_id_feature_5\"]");
	By style=By.xpath("//*[@id=\"layered_id_feature_11\"]");

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
	
	public void lauchsearchpage()
	{
		d.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		System.out.println(d.getTitle());
	}


	//filtering products by its features
	
	public void mouseactions()
	{

		WebElement a1= d.findElement(women);
		WebElement a2=d.findElement(tshirts);
		Actions act = new Actions(d);
		act.moveToElement(a1);
		act.moveToElement(a2).click().build().perform();;

	}


	public void sizecolour()
	{
		d.findElement(size).click();
		d.findElement(color).click();
	}

	public void stylecomposition()
	{
		d.findElement(composition).click();
		d.findElement(style).click();
	}

	//Taking screenshots of the scenario
	public void Screenshot2() throws IOException

	{
		JavascriptExecutor j = (JavascriptExecutor)d;   //scroll down
		j.executeScript("window.scrollBy(0,600)");
		TakesScreenshot t = (TakesScreenshot)d;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\git\\SEARCHAUTOMATION_CTS_PROJECT\\Searchautomation\\src\\test\\resources\\Screenshots\\Screenshots2.png"));
	}

	public void Close()
	{
		d.close();
	}

}

