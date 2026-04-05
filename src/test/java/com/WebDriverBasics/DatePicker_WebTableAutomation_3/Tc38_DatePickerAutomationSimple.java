package com.WebDriverBasics.DatePicker_WebTableAutomation_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc38_DatePickerAutomationSimple {
  @Test
  public void testDatePicker()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/datepicker");
	  
	  driver.findElement(By.id("datepicker")).sendKeys("06/10/2026");
	  
	  
  }
}
