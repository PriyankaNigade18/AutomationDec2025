package com.WebDriverBasics.SpecialScenarios_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc66_ShadowDomElement {
  @Test
  public void testShadowDomElement()
  {
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll down the page
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='ShadowDOM']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //document-->host--->root-->shadow element
	  
	  //mobiles
	  WebElement host1=driver.findElement(By.cssSelector("#shadow_host"));
	  
	  //host-->root
	  SearchContext root1=host1.getShadowRoot();
	  
	  //root--->element
	 String text1= root1.findElement(By.cssSelector("#shadow_content")).getText();
	  System.out.println(text1);
	  
	  //laptops
	  //root1--->host2--->root2--->element
	 WebElement host2=root1.findElement(By.cssSelector("#nested_shadow_host"));
	  
	 //root
	 SearchContext root2=host2.getShadowRoot();
	 
	 String text2=root2.findElement(By.cssSelector("#nested_shadow_content")).getText();
	  System.out.println(text2);
	  
	  
	  //input box
	  root1.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello All");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
