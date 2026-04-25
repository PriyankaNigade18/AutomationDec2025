package com.WebDriverBasics.ActionsClass_7;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc54_RightclickAction {
  @Test
  public void rightClickAction() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //button-->rightclick--->contextClick()
	  WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions act=new Actions(driver);
	  act.contextClick(button).perform();
	  
	  //list of options
	  List<WebElement> allOptions=driver.findElements(By.xpath("//ul[contains(@class,'context-menu-root')]//li//span"));
	  for(WebElement i: allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //alert will open
	  
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
