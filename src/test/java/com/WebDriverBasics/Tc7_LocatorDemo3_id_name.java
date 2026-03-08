package com.WebDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc7_LocatorDemo3_id_name {

	public static void main(String[] args) throws InterruptedException 
	{
		// create a driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open application
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		driver.findElement(By.linkText("Sign In")).click();
		
		//email: id()
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password : name()
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.id("submit-id")).click();
		
		//static wait
		Thread.sleep(2000);
		
		
		//to identify element when there is no id,name,classname -->tagname
		//to get the text of any webelement we use getText()
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Result text is: "+text);
		
		
		

	}

}
