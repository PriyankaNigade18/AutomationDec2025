package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Tc23_RelativeloctaorsInSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//Enter email into email address field which is above password
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test@gmail.com");
		
		
		//enter password into password field which is below email address
		WebElement emailId=driver.findElement(By.id("email-id"));
		
		driver.findElement(RelativeLocator.with(By.id("password")).below(emailId)).sendKeys("test123");
		
		
		//check the checkbox which is near to Remember Me text
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		//click o Submit button which is below checkbox
		driver.findElement(RelativeLocator.with(By.id("submit-id")).below(By.id("remember"))).click();
		
		//enter keyword into search box which is left of SignOut link
		
		driver.findElement(RelativeLocator.with(By.cssSelector("input[placeholder='Search']")).toLeftOf(By.xpath("//a[text()='Sign Out']"))).sendKeys("crm");
		
		Thread.sleep(2000);
		//enter keyword into search box which is right of CustomerSevrice
		driver.findElement(RelativeLocator.with(By.cssSelector("input[placeholder='Search']")).toRightOf(By.xpath("//a[text()='Customer Service']"))).clear();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
