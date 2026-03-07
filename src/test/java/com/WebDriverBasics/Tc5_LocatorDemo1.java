package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc5_LocatorDemo1 {

	public static void main(String[] args)
	{
		// Create driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");
		
		
		//Technique3: Identify element+action
		driver.findElement(By.id("APjFqb")).sendKeys("Testing");
		
		
				
		/*
		//Technique2: Identify+Validation+Action
		
		WebElement searchEle=driver.findElement(By.id("APjFqb"));
		
		if(searchEle.isDisplayed() && searchEle.isEnabled())
		{
			//enter 
			searchEle.sendKeys("Selenium");
		}
		
		
		
		
		
		/*
		//Technique1:By Locator(Framework design) Identify +Validation+action
		
		//By is Selenium Class to identify address of webelement
		By searchBoxAddress=By.id("APjFqb");
		
		//Identify Webelement
		WebElement searchEle=driver.findElement(searchBoxAddress);
		
		//validate weblement
		System.out.println("Is Searchbox displayed on webpage?: "+searchEle.isDisplayed());//true
		
		System.out.println("Is Searchbox is enabled?: "+searchEle.isEnabled());//true
		
		//perform action: On searchbox wanted to type:sendKeys()
		searchEle.sendKeys("Java",Keys.ENTER);
		
		*/
		
		
		
		

	}

}
