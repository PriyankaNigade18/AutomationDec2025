package com.WebDriverBasics.Alerts_FrameAutomation6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc52_FrameAutomationDemo1 {
  @Test
  public void testIFrame() throws InterruptedException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  //frame with indexing
	  //driver.switchTo().frame(0);
	  
	  //frame with id/name attribute
	  //driver.switchTo().frame("mce_0_ifr");
	  
	  //frame with webelement
	  WebElement frameEle=driver.findElement(By.id("mce_0_ifr"));
	  driver.switchTo().frame(frameEle);
	  
	  //NoSuchElementException: no such element: Unable to locate element: {"method":"tag name","selector":"p"}
	  driver.findElement(By.tagName("p")).clear();
	  Thread.sleep(1500);
	  driver.findElement(By.tagName("p")).sendKeys("Hello All");
	  
	  
	  
  }
}
