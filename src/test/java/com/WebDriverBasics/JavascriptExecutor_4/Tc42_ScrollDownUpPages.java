package com.WebDriverBasics.JavascriptExecutor_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc42_ScrollDownUpPages {
  @Test
  public void testScroll() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  
	  ElementUtil.scrollDown(driver);
	  
	  Thread.sleep(2000);
	  
	  ElementUtil.scrollUp(driver);
	  
	  Thread.sleep(2000);
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Best Sellers in Beauty']"));

	  ElementUtil.scrollUptpElement(driver,ele);
	  
	  
	  /*
	  //scroll down the web page
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  //js.executeScript("window.scrollTo(0,5000)");
	  
	  //scroll down
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  //scrollUp
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Thread.sleep(2000);
	  
	  //scroll upto any element
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='Best Sellers in Beauty']"));
	  
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	 */ 
	  
	  
	  
	  
  }
}
