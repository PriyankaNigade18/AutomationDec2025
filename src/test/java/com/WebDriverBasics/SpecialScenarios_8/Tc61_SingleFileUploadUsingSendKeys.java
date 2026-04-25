package com.WebDriverBasics.SpecialScenarios_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc61_SingleFileUploadUsingSendKeys {
  @Test
  public void fileUpload()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll upto element
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Upload Files']"));
	  
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  //choose file[type='file']
	  driver.findElement(By.id("singleFileInput")).sendKeys("C://Users//piyun//OneDrive//Desktop//OAuth2.0.txt");
	  
	  //upload
	  driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
	  
	  System.out.println("Status: "+driver.findElement(By.id("singleFileStatus")).getText());
  }
}
