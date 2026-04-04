package com.WebDriverBasics.Dropdown_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc31_GoibiboDropdownAutomation {
  @Test
  public void autosuggetionDropdownAutomation()
  {
	  
	  //due to high security while automation it get block so off the firewall private and public network it will work
	    
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/");
	  
	  //close the popup
	  driver.findElement(By.cssSelector("span[class*='icClose']")).click();
	  
	 
	 
	  
	  
  }
}
