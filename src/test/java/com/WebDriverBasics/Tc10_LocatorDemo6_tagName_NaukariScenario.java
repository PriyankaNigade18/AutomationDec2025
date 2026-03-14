package com.WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc10_LocatorDemo6_tagName_NaukariScenario {

	public static void main(String[] args) 
	{
		// Create driver session with chrome
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());
		
		String exp="//www.naukri.com/engineering-jobs";
		
		for(WebElement i:allLinks)
		{
			System.out.println("Attribute:"+i.getDomAttribute("href"));
			System.out.println("Text:"+i.getText());
			try {
			if(i.getDomAttribute("href").contains(exp))
			{
				System.out.println("Link Found!");
				break;
				
			}
			}catch(NullPointerException n)
			{
				System.out.println("Attribute href value is null.......");
			}
			
		}

	}

}
