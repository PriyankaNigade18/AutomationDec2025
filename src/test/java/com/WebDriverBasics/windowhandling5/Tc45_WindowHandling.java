package com.WebDriverBasics.windowhandling5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc45_WindowHandling 
{
  @Test
  public void testWindowHandling()
  {
	  
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  //homepage
	  
	  
	  String parentId=driver.getWindowHandle();
	System.out.println(parentId);
	
	  //Click on new tab button
	  driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	  	  //page open in new tab
	  	Set<String> allWindows=driver.getWindowHandles();
	  	System.out.println(allWindows);
	  	
	  	for(String childId:allWindows)
	  	{
	  		//parentid and childid if both are different then switch childid
	  		if(!parentId.equals(childId))//parentid is not equal to child id
	  		{
	  			//child window
	  			driver.switchTo().window(childId);
	  			 //search 
	  		  driver.findElement(By.name("q")).sendKeys("testng");//NoSuchElementException
	  		  
	  		  //close():close current active window vs quit():close all open windows
	  		  //driver.close();
	  		//driver.quit();
	  		}
	  	}
	  	
	  	//parent window
	  	driver.switchTo().window(parentId);
	  	driver.findElement(By.id("name")).sendKeys("Priyanka");
	  	
	  	
	  	
	 
	

	  
	  
	  
	  
  }
}
