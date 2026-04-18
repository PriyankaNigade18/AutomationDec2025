package com.WebDriverBasics.windowhandling5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc46_MultipleWindows {
  @Test
  public void testMultipleWindows()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  //click on popup windows
	  driver.findElement(By.id("PopUp")).click();
	  
	  //multiple windows will open
	  Set<String> windows=driver.getWindowHandles();//[101,102,103]
	  
	  //same order:convert set to list
	  List<String> allWindows=new ArrayList<String>(windows);
	  System.out.println("Total windows open: "+allWindows.size());//3
	  
	  for(String childWindow:allWindows)//[101,102,103]
	  {
//		  driver.switchTo().window(childWindow);
//		  System.out.println(driver.getTitle());
		  
		  String appTitle=driver.switchTo().window(childWindow).getTitle();
	  if(appTitle.contains("Testing Practice"))
	  {
		  
		  System.out.println("Found right window");
		  System.out.println("Current url is: "+driver.getCurrentUrl());
		  System.out.println("Title is: "+driver.getTitle());
		  break;
	  }
	  
	   }
}
}