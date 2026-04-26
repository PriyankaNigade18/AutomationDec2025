package com.WebDriverBasics.SpecialScenarios_8;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc64_FileDownloadScenario {
  @Test
  public void testFileDownload() 
  {
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("download.default_directory","C:\\Users\\piyun\\OneDrive\\Desktop\\Trainings\\Dec25JavaSeleniumWorkspace\\SeleniumMaven");
	  options.setExperimentalOption("prefs",prefs);
	  
	  
	    
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  //download file
	  driver.findElement(By.linkText("sampleFile.txt")).click();
	  //file will be download in system
	  //file should be downloaded in project
	  
  }
}
