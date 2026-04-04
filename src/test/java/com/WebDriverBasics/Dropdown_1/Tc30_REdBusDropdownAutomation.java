package com.WebDriverBasics.Dropdown_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc30_REdBusDropdownAutomation {
  @Test
  public void autosuggetionDropdown() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  driver.findElement(By.id("srcinput")).sendKeys("Pune");
	  
	  //static wait
	  Thread.sleep(1500);
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//div[contains(@class,'searchCategory')])[1]//div[@role='heading']"));
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Viman Nagar"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
  }
}
