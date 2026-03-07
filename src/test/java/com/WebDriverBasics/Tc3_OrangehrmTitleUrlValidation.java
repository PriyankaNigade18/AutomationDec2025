package com.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Tc3_OrangehrmTitleUrlValidation {

	public static void main(String[] args)
	{
		// Create driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.orangehrm.com/");
		
		//get the application title and validate it 
		
		String expTitle="Human Resources Management Software | HRMS | OrangeHRM";
		String actTitle=driver.getTitle();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Application title is: "+actTitle);
			System.out.println("Title matched....Test Pass!");
		}else
		{
			System.out.println("Title not matched....Test Fail!");
		}
		
		//url validation
		String expUrl="orangehrm.com";
		String actUrl=driver.getCurrentUrl();
		
		if(actUrl.contains(expUrl))
		{
			System.out.println("Url is: "+actUrl);
			System.out.println("Url matched...Test PaSS!");
		}else
		{
			System.out.println("Url not matched....Test Fail!");
		}
		
		
		//close browser
		driver.quit();
		
		

		
	}

}
