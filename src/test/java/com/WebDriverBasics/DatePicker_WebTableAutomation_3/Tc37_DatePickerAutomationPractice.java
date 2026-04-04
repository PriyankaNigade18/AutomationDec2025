package com.WebDriverBasics.DatePicker_WebTableAutomation_3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc37_DatePickerAutomationPractice {
  @Test
  public void testDatePicker() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  //driver.manage().window().maximize();

	  	//open calendar
	  driver.findElement(By.id("datepicker")).click();
	  
	  //expectations
	  String month="November";
	  String date="27";
	  String year="2026";
	  
	  //month selection
	  while(true)
	  {
		  String actMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		  String actYear=driver.findElement(By.className("ui-datepicker-year")).getText();

	  if(actMonth.contains(month) && actYear.contains(year))
	  {
		  //month found
		  break;
	  }else
	  {
		  //click on arrow
		  driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-triangle-e')]")).click();
	  }
	  
	  }
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
  }
}
