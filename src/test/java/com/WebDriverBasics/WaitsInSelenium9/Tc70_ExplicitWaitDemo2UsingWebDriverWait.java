package com.WebDriverBasics.WaitsInSelenium9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc70_ExplicitWaitDemo2UsingWebDriverWait {
  @Test
  public void testWait() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By startButton=By.tagName("button");
	  
	  By textEle=By.xpath("(//h4)[2]");
	  
	  driver.findElement(startButton).click();//wait
	  
	  String text=ElementUtil.waitForVisibilityOfElement(driver,textEle).getText();
	  
	  //String text=driver.findElement(textEle).getText();
	  
	  System.out.println(text);
	  
	  
	  
	  
	  
  }
}
