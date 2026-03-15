package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc16_LocatorDemo12_XpathOperators_Indexing {

	public static void main(String[] args)
	{
		// create driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//firstname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Smita");
		
		//lastname: and operator
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Parab");
		
		//create dynamic email
		String email="smita"+System.currentTimeMillis()+"@gmail.com";
		
		//email: or operator
		driver.findElement(By.xpath("//input[ @type='email' or @class='form-contro']")).sendKeys(email);
		
		//telephone: with indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("676769798");
		
		//password: with indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		
		//confirm: position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//yes radio button
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//to get the success message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println("Success message: "+text);
		
		
		
		
		

	}

}
