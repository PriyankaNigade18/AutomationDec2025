package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc22_XpathAxiesLocators {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/customers.html?email-name=sdasdsd%40gmail.com&password-name=sadscasc&submit-name=");
		
		//ancestor: Ancestor tagname for John
		String tag1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor Tagname for John:  "+tag1);//tbody
		
		//parent: Parent tagname for John
		String tag2=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tagname for John: "+tag2);//tr
		
		//childs for row4
		int count=driver.findElements(By.xpath("//tbody/tr[4]/child::td")).size();
		System.out.println("Total childs for row4: "+count);//5
		
		//Find the number of rows after John row
		int rowsCount=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("After John row total rows are: "+rowsCount);//2
		
		//Find the number of <td> after John
		int tdCount=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("After John row total td are: "+tdCount);//13
		
		//Find the number of rows before John row
		int beforeRows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Before John element number of rows are: "+beforeRows);//4
		
		//Find the number of <td> after John
		int ptdCount=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Before John row total td are: "+ptdCount);//16
		
		//Find the following sibling for John
		int fs=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("For John Following siblings are: "+fs);//3
		
		//Find the preceding sibling for John
		int ps=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("For John Preceding siblings are: "+ps);//1
		
	}

}
