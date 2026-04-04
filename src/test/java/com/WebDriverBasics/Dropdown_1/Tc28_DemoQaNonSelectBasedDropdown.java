package com.WebDriverBasics.Dropdown_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc28_DemoQaNonSelectBasedDropdown {
  @Test
  public void bootstrapdropdown() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demoqa.com/select-menu");
	  
	  driver.findElement(By.xpath("(//input[contains(@id,'react-select')])[1]")).click();
	  
	  //options
	 List<WebElement> allOptions=driver.findElements(By.xpath("//div[@role='option']"));
	 System.out.println("Total Options are: "+allOptions.size());
	 
	 for(WebElement i:allOptions)
	 {
		 System.out.println(i.getText());
		 if(i.getText().contains("A root option"))
		 {
			 i.click();
			 break;
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
  }
}
