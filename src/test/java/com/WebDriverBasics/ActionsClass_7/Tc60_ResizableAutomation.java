package com.WebDriverBasics.ActionsClass_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc60_ResizableAutomation {
  @Test
  public void testResizeOfElement()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.cssSelector("div[class*='ui-icon']"));
	  
	  //action
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).dragAndDropBy(ele,80,50).build().perform();
	  
	  
	  
	  
	  
	  
	  
  }
}
