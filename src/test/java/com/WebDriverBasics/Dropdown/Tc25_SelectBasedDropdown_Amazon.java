package com.WebDriverBasics.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc25_SelectBasedDropdown_Amazon {
  @Test
  public void testDropdown() throws InterruptedException 
  {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  //identify address of dropdown
	  WebElement dropDownEle=driver.findElement(By.id("searchDropdownBox"));	  
	  
	  //create object of Select class
	  Select sc=new Select(dropDownEle);
	  
	  System.out.println("Is Dropdown support multiple selection?: "+sc.isMultiple());//false
	  
	  //select single option
	  sc.selectByIndex(3);
	  
	  //static wait
	  Thread.sleep(1500);
	  //java.lang.UnsupportedOperationException: You may not select an option in invisible select
	  //sc.selectByVisibleText("Appliances");
	  
	  sc.selectByValue("search-alias=audible");
	  
	  //to get number of options from dropdown we have getOptions()
	  
	  List<WebElement> allOptions=sc.getOptions();
	  System.out.println("Total Dropdown options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Prime Video"))
		  {
			  //click
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
