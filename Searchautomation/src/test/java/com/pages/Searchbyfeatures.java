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

public class Searchbyfeatures
{
	WebDriver d;
By women=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
By tshirts=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
By size=By.xpath("//*[@id=\"layered_id_attribute_group_2\"]");
By color=By.xpath("//*[@id=\"layered_id_attribute_group_14\"]");
By composition=By.xpath("//*[@id=\"layered_id_feature_5\"]");
By style=By.xpath("//*[@id=\"layered_id_feature_11\"]");

public void launchy() 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver.exe");
	d= new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	d.get("http://automationpractice.com/index.php?id_category=5&controller=category");
}
	
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
public void Screenshot2() throws IOException
{
	JavascriptExecutor j = (JavascriptExecutor)d;   //scroll down
	j.executeScript("window.scrollBy(0,600)");
	TakesScreenshot t = (TakesScreenshot)d;
	File f = t.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\sharo\\Downloads\\Searchautomation\\src\\test\\resources\\Screenshots\\Screenshots2.png"));
}
public void Close()
{
	d.close();
}
}

