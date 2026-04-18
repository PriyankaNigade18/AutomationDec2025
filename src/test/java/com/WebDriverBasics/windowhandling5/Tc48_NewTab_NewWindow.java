package com.WebDriverBasics.windowhandling5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc48_NewTab_NewWindow {
  @Test
  public void testTabWindow() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  String parent=driver.getWindowHandle();
	  
	  //open in new tab facebook app
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  //open new window for amazon
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  
	  Set<String> windows=driver.getWindowHandles();
	  
	  //Order collection
	  List<String> allWindows=new ArrayList<String>(windows);
	  System.out.println("Total Windows: "+allWindows.size());
	  for(String i:allWindows)
	  {
		  driver.switchTo().window(i);
		  System.out.println(driver.getTitle());
	  }
	  
	  ElementUtil.switchToSpecificWindow(driver,allWindows,"Facebook");
	  
	  
	  ElementUtil.switchToParentWindow(driver,parent);
	  
	  //ElementUtil.closeChildWindows(driver,allWindows,parent);
	  
	  ElementUtil.closeAllWindows(driver,allWindows);
 
  }
}
