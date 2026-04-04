package com.WebDriverBasics.DatePicker_WebTableAutomation_3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc36_CalendarAutomation_RedBus {
  @Test
  public void automateCalendar() throws InterruptedException
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  //driver.manage().window().maximize();

	  	//open calendar
	  driver.findElement(By.xpath("//div[contains(@class,'dateInputWrapper')]")).click();
	  
	  //expectations
	  String month="November";
	  String date="27";
	  String year="2026";
	  
	  //month selection
	  while(true)
	  {
	  String text=driver.findElement(By.xpath("//p[contains(@class,'monthYear')]")).getText();
	  //System.out.println(text);
	  String actMonth=text.split(" ")[0];
	  String actYear=text.split(" ")[1];
//	  System.out.println(actMonth);
//	  
//	  System.out.println(actYear);
	  
	  if(actMonth.contains(month) && actYear.contains(year))
	  {
		  //month found
		  break;
	  }else
	  {
		  //click on arrow
		  driver.findElement(By.xpath("//i[contains(@aria-label,'Next month')]")).click();
	  }
	  
	  }
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//div[contains(@class,'dateWrap')]//div[contains(@class,'date')]"));
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
