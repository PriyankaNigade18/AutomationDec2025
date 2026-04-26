package com.WebDriverBasics.SpecialScenarios_8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc62_FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException, InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //click on choose file button
	 // driver.findElement(By.id("file-upload")).click();
	  
	  //using JavascriptExecutor
	  WebElement ele=driver.findElement(By.id("file-upload"));
//	  
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  js.executeScript("document.getElementById('file-upload').click();",ele);
//	  
	  
	  //Actions class
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).click().build().perform();
	  
	  //Window explorer handle using Robot Class(Java)

	  Robot rb=new Robot();
	  rb.delay(4000);
	  
	  //Copy file(clipboard action Ctrl+c)
	  StringSelection sc=new StringSelection("C:\\Users\\piyun\\OneDrive\\Desktop\\OAuth2.0.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  //paste(ctrl+v):virtual keyboard
	  //press the keys
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //release the same
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //enter
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  
	  //file upload
	  driver.findElement(By.id("file-submit")).click();
	  Thread.sleep(3000);
	  
	  System.out.println(driver.findElement(By.tagName("h3")).getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
