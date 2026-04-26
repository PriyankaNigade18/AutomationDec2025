package com.WebDriverBasics.SpecialScenarios_8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc65_SVGElementAutomation {
  @Test
  public void testSVG()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  List<WebElement> allElements=driver.findElements(By.xpath("//a//*[name()='svg']"));
	  System.out.println("Total Elements are: "+allElements.size());
	  
	  for(WebElement i:allElements)
	  {
		  i.click();
	  }
	  
	  
	  
	  
	  
	  
  }
}
