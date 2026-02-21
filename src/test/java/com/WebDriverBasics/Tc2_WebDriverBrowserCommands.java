package com.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tc2_WebDriverBrowserCommands {

	public static void main(String[] args)
	{

		//driver session for chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://automationplayground.com/crm/");
		
		//get the title
		String actualTitle=driver.getTitle();
		System.out.println("Application title is: "+actualTitle);
		
		//get current url 
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Application Url is: "+actualUrl);
		
		//get the page source code
		System.out.println(driver.getPageSource());
		
		//close browser 
		//driver.close();
		
		driver.quit();

	}

}
