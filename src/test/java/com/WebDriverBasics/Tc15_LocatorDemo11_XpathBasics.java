package com.WebDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc15_LocatorDemo11_XpathBasics {

	public static void main(String[] args)
	{
		// Create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("test2525@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		//login
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//assertion
		String expTitle="My Account";
		
		if(driver.getTitle().contains(expTitle))
		{
			System.out.println("Test Pass...Login completed!");
		}else
		{
			System.out.println("Test Fail...Login Fail!");
		}

	}

}
