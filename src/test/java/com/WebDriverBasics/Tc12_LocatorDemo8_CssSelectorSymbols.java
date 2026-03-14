package com.WebDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc12_LocatorDemo8_CssSelectorSymbols {

	public static void main(String[] args) 
	{
		// Create driver sesssion with chrome
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//searchBox: contains*: type Mobile
		driver.findElement(By.cssSelector("input[id*='searchtext']")).sendKeys("Mobile",Keys.ENTER);
		
		
		//searchbox : ^Starts-with : clear the previous text
		driver.findElement(By.cssSelector("input[id^='twotab']")).clear();
		
		
		//searchbox: $ends-with: type bags
		driver.findElement(By.cssSelector("input[id$='box']")).sendKeys("Bags",Keys.ENTER);
		
		
		
		
		
		

	}

}
