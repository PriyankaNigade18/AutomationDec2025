package com.WebDriverBasics.Dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc24_TestNGClassIntro 
{
  @Test
  public void testcase1()
  {
	  System.out.println("Hello everyone...Lets learn TestNG");
  }
  
  
  @Test
  public void testcase2()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
	  driver.quit();
  }
  
  
  
}



