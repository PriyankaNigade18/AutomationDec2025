package com.WebDriverBasics.WaitsInSelenium9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc69_ExplicitWaitUsingWebDriverWaitDemo1 {
  @Test
  public void testWait() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators
	  By emailEle=By.id("input-email");
	  By passwordEle=By.id("input-password");
	  By loginButton=By.xpath("//input[@value='Login']");
	  
	  
	  ElementUtil.waitForPresenceOfElement(driver,emailEle).sendKeys("test@gmail.com");
	  ElementUtil.waitForVisibilityOfElement(driver,passwordEle).sendKeys("test123");
	  ElementUtil.waitForElementToBeClick(driver,loginButton).click();
	  
	  
	  
	  /*
	   * Explicit wait is applicable for single webelement
	   * and Based on element condition we can add this wait
	   * 
	   * org.openqa.selenium.TimeoutException: Expected condition failed:
	   *  waiting for presence of element found by By.id: input-email####
			(tried for 5 seconds with 500 milliseconds interval)
			here interval time = polling time =500ms = 0.5sec
	   
	  //email
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement emailId= wait1.until(ExpectedConditions.presenceOfElementLocated(emailEle));
	  
	  //action
	  emailId.sendKeys("test@gmail.com");
	  
	  //password
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement pswEle=wait2.until(ExpectedConditions.visibilityOfElementLocated(passwordEle));
	  
	  pswEle.sendKeys("test123");
	  
	  
	  //login button
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	  
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
