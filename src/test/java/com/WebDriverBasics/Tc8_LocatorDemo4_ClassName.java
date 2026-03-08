package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc8_LocatorDemo4_ClassName {

	public static void main(String[] args)
	{
		// create a driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.id("input-email")).sendKeys("test2525@gmail.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("test123");
		
		//login:className() :InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-primary")).click();
		
		//driver.findElement(By.className("btn-primary")).click();//not work as locator is not unique
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

}
