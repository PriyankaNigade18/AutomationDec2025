package com.WebDriverBasics.JavascriptExecutor_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc44_HiddenElementAutomation {
  @Test
  public void testHiddenElement() throws InterruptedException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.letskodeit.com/practice");
	  
	  //click on hide button
	  driver.findElement(By.id("hide-textbox")).click();
	  
	 
	  //element will be hidden
	  
	  //ElementNotInteractableException: element not interactable
	  //driver.findElement(By.id("displayed-text")).sendKeys("Hello");
	  
	  //hidden element automation is possible with JavascriptExecutor
	  
	  WebElement ele=driver.findElement(By.id("displayed-text"));
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  js.executeScript("arguments[0].value='Testing'",ele);
	  
	  Thread.sleep(2000);
	  //click on show
	  
	  driver.findElement(By.id("show-textbox")).click();
	  
	  
	  
	  
	  
  }
}
