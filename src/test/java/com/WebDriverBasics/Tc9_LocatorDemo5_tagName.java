package com.WebDriverBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc9_LocatorDemo5_tagName {

	public static void main(String[] args) 
	{
		// create driver session with Chrome
		WebDriver driver=new ChromeDriver();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//findElement() throws exception if element not found
		//driver.findElement(By.name("priyanka")).click();//NoSuchElementException

		
		//findElements() never throws expection if element not found
		List<WebElement> allInputs=driver.findElements(By.tagName("priyanka"));
		System.out.println("Total Input boxes are: "+allInputs.size());//0
		System.out.println(allInputs);//[]

		//number of input boxes
		List<WebElement> allInputs2=driver.findElements(By.tagName("input"));
		System.out.println("Total Input boxes are: "+allInputs2.size());//3
		//number of images
		int totalImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+totalImages);//3
		
		
		//number of links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are : "+allLinks.size());//5
		
		/*
		 * get the total links and capture value of href attribute and print text of link
		 */
		
		String exp="https://www.youtube.com/c/OrangeHRMInc";
		
		for(WebElement i:allLinks)
		{
			System.out.println("href Attribute value: "+i.getDomAttribute("href"));
			System.out.println("Text of Links: "+i.getText());
			
			if(i.getDomAttribute("href").equals(exp))
			{
				System.out.println("Link Found....");
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
