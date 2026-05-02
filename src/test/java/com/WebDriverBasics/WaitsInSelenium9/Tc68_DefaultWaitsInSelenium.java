package com.WebDriverBasics.WaitsInSelenium9;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc68_DefaultWaitsInSelenium {
  @Test
  public void f() 
  {
	  
	  ChromeDriver driver=new ChromeDriver();
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> allProp=cap.asMap();
	  
	  System.out.println(allProp);
	  
	  //timeouts={implicit=0, pageLoad=300000, script=30000},
	  
	  /*
	   * {acceptInsecureCerts=false,
	   *  browserName=chrome,
	   *   browserVersion=147.0.7727.138, 
	   *   chrome={chromedriverVersion=147.0.7727.117 (474cc805edd6b22006509896c910f6b6da2427ad-refs/branch-heads/7727_111@{#4}),
	   *    userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir10740_2114222310},
	   *     fedcm:accounts=true, goog:chromeOptions={debuggerAddress=localhost:65250}, 
	   *     goog:processID=8408, networkConnectionEnabled=false, 
	   *     pageLoadStrategy=normal, 
	   *     platformName=windows, proxy=Proxy(),
	   *      se:cdp=ws://localhost:65250/devtools/browser/9df530ab-8782-436a-8b3c-dee82987af15, 
	   *      se:cdpVersion=147.0.7727.138, 
	   *      setWindowRect=true, 
	   *      strictFileInteractability=false,
	   *       timeouts={implicit=0, pageLoad=300000, script=30000}, unhandledPromptBehavior=dismiss and notify, webauthn:extension:credBlob=true, webauthn:extension:largeBlob=true, 
	   *   webauthn:extension:minPinLength=true,
	   *  webauthn:extension:prf=true, 
	   *  webauthn:virtualAuthenticators=true}
	   */
  }
}
