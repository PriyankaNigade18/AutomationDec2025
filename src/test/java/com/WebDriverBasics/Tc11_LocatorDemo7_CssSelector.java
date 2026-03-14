package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc11_LocatorDemo7_CssSelector {

	
	public static void main(String[] args) 
	{
		//Create driver session with chrome
		WebDriver driver=new EdgeDriver();
		

		//open application
		driver.get("https://automationplayground.com/crm/login.html");

	
		//email id: tagname with id
		driver.findElement(By.cssSelector("input#email-id")).sendKeys("test1@gmail.com");
		
		
		//password: tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		//checkbox: tagname with id
		driver.findElement(By.cssSelector("#remember")).click();
		
		//Submit:tagname with className
		//driver.findElement(By.cssSelector("button.btn")).click();
		
		//Submit: tagname with id,classname,attribute
		driver.findElement(By.cssSelector("button#submit-id.btn[type='submit']")).click();
		
		
		//Assertion on navigation
		String exp="customers";
		if((driver.getCurrentUrl()).contains(exp))
		{
			System.out.println("User navigated to Customers page....");
		}
		else
		{
			System.out.println("Login Fail!");
		}
		
		
		//get the next page text
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}

}
