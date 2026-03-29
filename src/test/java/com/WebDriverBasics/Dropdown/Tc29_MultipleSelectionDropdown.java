package com.WebDriverBasics.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc29_MultipleSelectionDropdown {
  @Test
  public void testMultipleSelectionForBootstrap() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demoqa.com/select-menu");
	  
	  //multiple selection
	  
	  driver.findElement(By.xpath("(//input[contains(@id,'react-select')])[3]")).click();
	  
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[@role='option']"));
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  
		  System.out.println(i.getText());
		 
		  if(i.getText().contains("Blue") || i.getText().contains("Red"))
		  {
			  i.click();
			  
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
