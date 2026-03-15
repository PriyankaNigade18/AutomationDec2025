package com.WebDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc17_LocatorDemo13_XpathMethods {

	public static void main(String[] args) 
	{
		// create driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//click on Mobiles with text()
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//click on Cart with normalize-space()
		driver.findElement(By.xpath("//span[@class='nav-line-2' and normalize-space()='Cart']")).click();
		//(//span[normalize-space()='Cart'])[2]
		
		//get the cart text
		String text=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println("Cart text is: "+text);
		
		//searhc for keyword using contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("laptops",Keys.ENTER);
		
		//search box with starts-with()
		WebElement searchEle=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		//clear the text
		searchEle.clear();
		
		//search
		searchEle.sendKeys("bags",Keys.ENTER);
		
		
		
		
		
		
		
		

	}

}
