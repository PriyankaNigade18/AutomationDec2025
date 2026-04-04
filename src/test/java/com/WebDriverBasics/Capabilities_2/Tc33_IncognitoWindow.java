package com.WebDriverBasics.Capabilities_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc33_IncognitoWindow {
  @Test
  public void launchIncognitoBrowserWindow() 
  {
	  
	  
	  //set the capability
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--incognito");
	  
	  //assign property to current session
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.facebook.com");
	  
  }
}
