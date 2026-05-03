package com.TestNG.Basics1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc72_FirstTestCase {
 
  
  @Test(priority=1,description = "test execution on Firefox")
  public void firefoxTest() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
  }
  
  
  @Test(priority=2,description = "test execution on chrome")
  public void chromeTest() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
  }
   
}
