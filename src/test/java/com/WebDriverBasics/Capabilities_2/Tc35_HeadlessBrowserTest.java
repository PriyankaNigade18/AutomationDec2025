package com.WebDriverBasics.Capabilities_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc35_HeadlessBrowserTest {
  @Test
  public void testHeadless()
  {
	  		//set the properties
	  		ChromeOptions option=new ChromeOptions();
	  		option.addArguments("--headless");
	  
	       //assign property
			WebDriver driver=new ChromeDriver(option);
			System.out.println("Driver session is created....");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//open application
			driver.get("https://www.google.com/");
			
			System.out.println("Application open & title is: "+driver.getTitle());
			//search for keyword
			driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
			
			System.out.println("Search for Keyword: Jenkins");
			//list
			List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
			
			System.out.println("Total Options are: "+allOptions.size());
			
			System.out.println("Detail options are: ");
			for(WebElement i:allOptions)
			{
				System.out.println(i.getText());
			}
			
			
			
  }
}
