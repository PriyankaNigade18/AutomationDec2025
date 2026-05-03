package com.WebDriverBasics.ActionsClass_7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc55_DoubleClickAction {
  @Test
  public void testDoubleClick() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //button
	  WebElement buttonEle=driver.findElement(By.tagName("button"));
	  
	  //doubleclick action
	  Actions act=new Actions(driver);
	  act.doubleClick(buttonEle).perform();
	  
	  //Thread.sleep(2000);
	  
	  //alert
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert Message: "+alt.getText());
	  
	  //validation
	  String actMessage=alt.getText();
	  String expMessage="You double clicked me.. Thank You..";
	  
	  if(actMessage.contains(expMessage))
	  {
		  System.out.println("Test Pass!");
	  }
	  else
	  {
		  System.out.println("Test Fail");
	  }
	  
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
