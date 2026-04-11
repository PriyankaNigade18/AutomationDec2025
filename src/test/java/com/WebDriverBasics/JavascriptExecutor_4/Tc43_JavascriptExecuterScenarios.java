package com.WebDriverBasics.JavascriptExecutor_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc43_JavascriptExecuterScenarios {
  @Test
  public void testScenarios() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/form");
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  System.out.println("Title: "+driver.getTitle());
	  //to get the title of webpage
	  String title=js.executeScript("return document.title").toString();
	  System.out.println("Title is: "+title);
	  
	  Thread.sleep(1000);
	  
	  //refresh the webpage
	  //driver.navigate().refresh();
	  //To refresh webpage 
	  js.executeScript("history.go()");
	  
	  //To click on element
	  //driver.findElement(By.id("radio-button-1")).click();
	  WebElement ele=driver.findElement(By.id("radio-button-1"));
	  js.executeScript("arguments[0].click();",ele);
	  
	  WebElement name=driver.findElement(By.id("first-name"));	  
	  js.executeScript("arguments[0].value='Priyanka'",name);
	  
	  
  }
}
