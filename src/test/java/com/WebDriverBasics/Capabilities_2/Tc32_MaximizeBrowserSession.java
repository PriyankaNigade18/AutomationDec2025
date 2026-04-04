package com.WebDriverBasics.Capabilities_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc32_MaximizeBrowserSession {
  @Test
  public void testMaximize() 
  {
	  //set the capabilities
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--start-maximized");
	  
	  //assign capabilities to browser
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.google.com");
	  
	  //maximize browser
	  //driver.manage().window().maximize();
	  
	  //driver.manage().window().fullscreen();
	  
	  //driver.manage().window().minimize();
	  
  }
}
