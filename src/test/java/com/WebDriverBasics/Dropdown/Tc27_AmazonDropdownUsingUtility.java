package com.WebDriverBasics.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc27_AmazonDropdownUsingUtility {
  @Test
  public void testDropdown()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  //dropdown ele
	  WebElement dropdownEle=driver.findElement(By.id("searchDropdownBox"));
	  ElementUtil.selectdropdown(dropdownEle,"Audible Audiobooks");
	 
	 
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
