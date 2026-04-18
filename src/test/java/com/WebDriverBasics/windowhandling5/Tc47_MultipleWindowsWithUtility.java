package com.WebDriverBasics.windowhandling5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc47_MultipleWindowsWithUtility {
  @Test
  public void testUtility() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  String parentId=driver.getWindowHandle();	  
	  
	  //click on popup windows
	  driver.findElement(By.id("PopUp")).click();
	  
	  //multiple windows will open
	  Set<String> windows=driver.getWindowHandles();//[101,102,103]
	  
	  //same order:convert set to list
	  List<String> allWindows=new ArrayList<String>(windows);
	  System.out.println("Total windows open: "+allWindows.size());//3
	  
	  ElementUtil.switchToSpecificWindow(driver,allWindows,"Selenium");
	  
	  ElementUtil.switchToParentWindow(driver,parentId);
	  
	  ElementUtil.closeChildWindows(driver,allWindows,parentId);
  }
}
