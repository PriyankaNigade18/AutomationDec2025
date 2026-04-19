package com.WebDriverBasics.Alerts_FrameAutomation6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc50_AlertDemo2_Types {
  @Test
  public void automateAllAlerts() throws InterruptedException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  
	  //alert1:Simple Alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  Thread.sleep(2000);
	  
	  //alert 
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of Alert: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  WebElement resultEle=driver.findElement(By.id("result"));
	  System.out.println("Result is: "+resultEle.getText());
	  
	  //alert2:Confirmation alert
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  Thread.sleep(2000);
	  //alert
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Text of Alert: "+alt2.getText());
	  	//Ok
	  //alt2.accept();
	  //cancel
	  alt2.dismiss();
	  
	  System.out.println("Result Text: "+resultEle.getText());
	  
	  
	  	//alert3: prompt alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  Thread.sleep(2000);
	  //alert
	  Alert alt3=driver.switchTo().alert();
	  System.out.println("Alert Text is: "+alt3.getText());
	  //prompt
	  alt3.sendKeys("Hello All");
	  //Ok
	  alt3.accept();
	  System.out.println("Result Text: "+resultEle.getText());

	  
	  
	  
	  
	  
	  
	  
	  
  }
}
