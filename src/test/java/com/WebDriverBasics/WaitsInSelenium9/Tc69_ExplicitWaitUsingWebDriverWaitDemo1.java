package com.WebDriverBasics.WaitsInSelenium9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tc69_ExplicitWaitUsingWebDriverWaitDemo1 {
  @Test
  public void testWait() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators
	  By emailEle=By.id("input-email####");
	  By passwordEle=By.id("input-password");
	  By loginButton=By.xpath("//input[@value='Login']");
	  
	  /*
	   * Explicit wait is applicable for single webelement
	   * and Based on element condition we can add this wait
	   * 
	   * org.openqa.selenium.TimeoutException: Expected condition failed:
	   *  waiting for presence of element found by By.id: input-email####
			(tried for 5 seconds with 500 milliseconds interval)
			here interval time = polling time =500ms = 0.5sec
	   */
	  //email
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement emailId= wait1.until(ExpectedConditions.presenceOfElementLocated(emailEle));
	  
	  //action
	  emailId.sendKeys("test@gmail.com");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
