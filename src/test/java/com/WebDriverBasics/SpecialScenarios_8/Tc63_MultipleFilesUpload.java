package com.WebDriverBasics.SpecialScenarios_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc63_MultipleFilesUpload {
  @Test
  public void testMultipleFiles() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll upto element
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Upload Files']"));
	  
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  
	  //click on choose files
	  driver.findElement(By.id("multipleFilesInput")).sendKeys("C://Users//piyun//OneDrive//Desktop//OAuth2.0.txt\nC://Users//piyun//OneDrive//Desktop//demoqa_code.txt");
	  
	  driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	  
	  
	  
	  
  }
}
