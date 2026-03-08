package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc6_LocatorDemo2_LinkText_PartialLinkText {

	public static void main(String[] args)
	{
		//create a driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://automationplayground.com/crm/");
		
		//sign in link : linkText()
		//driver.findElement(By.linkText("Sign In")).click();
		
		//partialLinkText()
		driver.findElement(By.partialLinkText("Sign")).click();
	}

}
