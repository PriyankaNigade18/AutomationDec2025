package com.WebDriverBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc20_FooterLinkAutomation {

	public static void main(String[] args)
	{
		// create driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//div.navFooterVerticalRow>div ul>li>a
		List<WebElement> allFooterLinks=driver.findElements(By.xpath("//div[contains(@class,'navFooterVerticalRow')]/div//ul/li/a"));

		System.out.println("Total Footer links are: "+allFooterLinks.size());
		
		String expLink="Your Account";
		
		
		for(WebElement i:allFooterLinks)
		{
			System.out.println(i.getText());
			if(i.getText().contains(expLink))
			{
				System.out.println("Footer link found!");
				i.click();
				break;
			}
		}
	}

}
