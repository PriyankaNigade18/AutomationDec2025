package com.WebDriverBasics.Alerts_FrameAutomation6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc51_AuthenticationPopup {
  @Test
  public void testAuthPopup() {
	  
	  WebDriver driver=new ChromeDriver();
	  //driver.get("https://the-internet.herokuapp.com/basic_auth");
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  System.out.println(driver.findElement(By.tagName("p")).getText());
	  
  }
}
