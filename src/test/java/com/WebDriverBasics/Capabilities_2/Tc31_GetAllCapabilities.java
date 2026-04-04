package com.WebDriverBasics.Capabilities_2;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class Tc31_GetAllCapabilities 
{
	//Capabilities are options that you can use to customize and configure a ChromeDriver session. 

  @Test
  public void chromeCapabilities() 
  {
	
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  System.out.println("Browser Name: "+cap.getBrowserName());
	  System.out.println("Platform Name: "+cap.getPlatformName());
	  System.out.println("Browser version: "+cap.getBrowserVersion());
	  
	  //To get all browser properties : asMap()
	  
	  Map<String,Object> allProp=cap.asMap();
	  System.out.println(allProp);
	  
	  System.out.println("-----------------");
	  
	  EdgeDriver driver2=new EdgeDriver();
	  Capabilities cap2=driver2.getCapabilities();
	  Map<String,Object> allProp2=cap2.asMap();
	  
	  System.out.println(allProp2);
	  
	  
	  /*
acceptInsecureCerts=false,	   * {
	   *  browserName=chrome,
	   *   browserVersion=146.0.7680.178, 
	   * chrome={chromedriverVersion=146.0.7680.165 (4b989da09e15a7dc0de0785cb5ff232aadae3f0f-refs/branch-heads/7680@{#2932}), 
	   * userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir19516_1580614230}, 
	   * fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:52221},
	   *  goog:processID=23744, 
	   *  networkConnectionEnabled=false, pageLoadStrategy=normal, 
	   *  platformName=windows, proxy=Proxy(), 
	   *  se:cdp=ws://localhost:52221/devtools/browser/466b4022-051a-46eb-87ef-b592acd6a43a,
	   *   se:cdpVersion=146.0.7680.178, 
	   *   setWindowRect=true, strictFileInteractability=false, 
	   *   timeouts={implicit=0, pageLoad=300000, script=30000}, 
	   *   unhandledPromptBehavior=dismiss and notify,
	   *    webauthn:extension:credBlob=true, 
	   *    webauthn:extension:largeBlob=true, 
	   *    webauthn:extension:minPinLength=true,
	   *  webauthn:extension:prf=true, 
	   *  webauthn:virtualAuthenticators=true}
	   */
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
