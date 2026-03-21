package com.WebDriverBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc21_ListOfOptionsAutomation {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div.list-group>a"));

		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
	}

}
