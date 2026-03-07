package com.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc4_NavigationCommands {

	public static void main(String[] args) throws InterruptedException
	{
		//create driver session with chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com/");
		
		System.out.println("Application title is: "+driver.getTitle());
		
		//navigate to facebook
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println("Application title is: "+driver.getTitle());
		
		//static wait(Java)
		Thread.sleep(2000);

		//back
		driver.navigate().back();//google
		
		
		//static wait(Java)
		Thread.sleep(2000);
		
		//forward
		driver.navigate().forward();
		
		//static wait(Java)
		Thread.sleep(2000);
		
		//refresh
		driver.navigate().refresh();
		
		
		
	}

}
