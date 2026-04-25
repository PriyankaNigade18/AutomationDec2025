package com.WebDriverBasics.ActionsClass_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc58_SliderAutomation {
  @Test
  public void testSlider() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //slider Ele
	  WebElement sliderEle=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	  Actions act=new Actions(driver);
	  act.clickAndHold(sliderEle).moveToElement(sliderEle,200,0).build().perform();
	  
	  
	  
	  
	  
	  
  }
}
