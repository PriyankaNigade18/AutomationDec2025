package com.WebDriverBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc18_GoogleSearchAutomation {

	public static void main(String[] args) 
	{
		// create driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open application
		driver.get("https://www.google.com/");
		
		//search for keyword
		driver.findElement(By.id("APjFqb")).sendKeys("Jenkins");
		
		//list
		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
