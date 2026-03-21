package com.WebDriverBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc19_AmazonSerachAutomation {

	public static void main(String[] args)
	{
		// Create driver session 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		
		//div.left-pane-results-container>div[id*='sac-suggestion-row']
		List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div[contains(@id,'sac-suggestion-row')]"));

		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
		
		
		
	}

}
