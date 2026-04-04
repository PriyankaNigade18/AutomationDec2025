package com.WebDriverBasics.Capabilities_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc34_DisableNotifications {
  @Test
  public void testNotification() 
  {
	  //set the property
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  //assign property
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.goibibo.com/");
  }
}
