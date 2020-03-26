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
import org.openqa.selenium.interactions.Actions;

public class Moreinfo
{
	WebDriver d;
	By firstpoint=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");
	By more_option=By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]/span");
	
	
	
	public void launchy() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.get("http://automationpractice.com/index.php");
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
	public void Screenshot2() throws IOException
	{
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,800)");
		TakesScreenshot t = (TakesScreenshot)d;
		File f = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\\\Users\\\\sharo\\\\Downloads\\\\Searchautomation\\\\src\\\\test\\\\resources\\\\Screenshots\\Screenshots5.png"));
	}

	public void Close()
	{
	d.close();
	}
}
