package com.WebDriverBasics.SpecialScenarios_8;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc67_BrokenLinkAutomation 
{
	/*
	 * If the link status code if it is 400 and greater than 400 is broken

If link contains href attribute value as null or empty then such link we can not automate


1.link should have href attribute and it should not empty or null
2.only valid link request we can send to the server
3.get status code from server and validate it
	 */
  @Test
  public void testBrokenLink() throws Exception

  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");

	  
	  //get the all link from webpage
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total links are available: "+allLinks.size());
	  
	  int brokenLinks=0;
	  int validLinks=0;
	  for(WebElement link:allLinks)
	  {
		  //get the attribute value:getDomAttribute()
		  String hrefValue=link.getDomAttribute("href");
		  
		  try {
		  //hrefValue must not be null or empty
		  if(hrefValue==null||hrefValue.isEmpty())
		  {
			  System.out.println("If link is empty or null then we cannot automate that link");
			  System.out.println(hrefValue);
			  //skip
			  continue;
		  }
		  }catch(Exception e)
		  {
			  
		  }
		  //for valid link send request to server --->status code
		  
		  try {
			URL url=new URI(hrefValue).toURL();
			
			//open http connection
			HttpURLConnection httpUrl=(HttpURLConnection) url.openConnection();
			//connection to the server
			httpUrl.connect();
			
			
			
			//get the status code from server
			int statusCode=httpUrl.getResponseCode();
			
			if(statusCode>=400)
			{
				System.out.println("====Broken Link====");
				brokenLinks++;
			}else
			{
				System.out.println("====Valid Link=====");
				validLinks++;
			}
			
			
			
		  }catch(Exception e)
		  {
			  
		  }
		  
		  
		  
		  	  
		  
	  }
	  
	  System.out.println("Total broken links are: "+brokenLinks);
	  System.out.println("Total valid links are: "+validLinks);
	  
	  
	  
	  
  }
}
