package com.WebDriverBasics.Dropdown_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc32_MakeMyTripAppDropdownAutomation {
  @Test
  public void testDropdown() 
  {	    
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.makemytrip.com/");
	  //close the popup
	  driver.findElement(By.cssSelector("span.commonModal__close")).click();
	  
	  driver.findElement(By.id("fromCity")).click();
	  
	  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("India");
	  
	  
  }
  
}
