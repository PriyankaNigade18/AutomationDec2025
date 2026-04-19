package com.WebDriverBasics.Alerts_FrameAutomation6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc53_FrameWithNestedFrames {
  @Test
  public void testFrames() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame1
//	  WebElement fele=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//	  driver.switchTo().frame(fele);
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.name("mytext1")).sendKeys("Frame1 automated");
	  
	  //first come outside of frame1/main page
	  driver.switchTo().defaultContent();
	  
	  //frame2:NoSuchFrameException: no such frame
	  driver.switchTo().frame(1);
	  driver.findElement(By.name("mytext2")).sendKeys("Frame2 automated");
	  
	  //first come outside of frame2/main page
	  driver.switchTo().defaultContent();
	  
	  //frame3
	  driver.switchTo().frame(2);
	  driver.findElement(By.name("mytext3")).sendKeys("Frame3 automated");
	   
	  //Nested frame
	  //iframe(inner frame)
	  WebElement ele=driver.findElement(By.tagName("iframe"));
	  driver.switchTo().frame(ele);
	  //radio button
	  driver.findElement(By.id("i9")).click();
	  
	  Thread.sleep(2000);
	  
	  //come outside the inner frame and reach to parent
	  driver.switchTo().parentFrame();//frame3
	  
	  driver.findElement(By.name("mytext3")).clear();
	  driver.findElement(By.name("mytext3")).sendKeys("Fully automated!");
	  
	  //automate frame4 and frame5
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
