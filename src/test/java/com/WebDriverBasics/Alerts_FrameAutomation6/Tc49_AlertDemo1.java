package com.WebDriverBasics.Alerts_FrameAutomation6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc49_AlertDemo1 {
  @Test
  public void testAlert() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	 //email
	  driver.findElement(By.id("login1")).sendKeys("test123");
	  
	  //click on login button
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of alert: "+alt1.getText());
	  //Ok
	  alt1.accept();
	  
	  //password:UnhandledAlertException: unexpected alert open: {Alert text : Please enter your password}
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  
	  
	  
  }
}
