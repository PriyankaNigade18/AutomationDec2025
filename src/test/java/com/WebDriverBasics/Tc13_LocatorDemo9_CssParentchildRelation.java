package com.WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc13_LocatorDemo9_CssParentchildRelation {

	public static void main(String[] args) 
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//parent to child elements
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div.list-group>a"));
		
		System.out.println("Total Options are: "+allOptions.size());

		for(WebElement i:allOptions)
		{
			System.out.println(i.getDomAttribute("href"));
			System.out.println(i.getText());
			
			if(i.getText().contains("Forgotten Password"))
			{
				//click on element
				i.click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		

	}

}
