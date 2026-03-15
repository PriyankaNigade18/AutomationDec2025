package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc14_LocatorDemo10_CssWithIndexing {

	public static void main(String[] args) {
		//create driver session
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
				

		//with indexing
		driver.findElement(By.cssSelector("div.list-group>a:nth-child(3)")).click();
	}

}
