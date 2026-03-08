package com.WebDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc9_LocatorDemo5_tagName {

	public static void main(String[] args) 
	{
		// create driver session with Chrome
		WebDriver driver=new ChromeDriver();
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//number of input box count
		int allInputBox=driver.findElements(By.tagName("input")).size();
		System.out.println("Total Input boxes are: "+allInputBox);//3
		
		//number of images
		int allImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+allImages);//3
		
		//number of links
		int allLinks=driver.findElements(By.tagName("a")).size();
		System.out.println("Total Links are: "+allLinks);//5
		
	}

}
