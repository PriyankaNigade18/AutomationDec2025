package com.TestNG.Basics1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc77_Dependency
{
	
  @Test(priority=1)
  public void startBrowser() 
  {
	  System.out.println("Launch Browser");
  }
  
	
  @Test(priority=2,dependsOnMethods = "startBrowser",timeOut = 1000)
  public void openApplication() throws InterruptedException 
  {
	  
	  Thread.sleep(3000);
	  System.out.println("Open Application after 1sec");
	  
  }
  
	
  @Test(priority=3,dependsOnMethods = "openApplication")
  public void findElement() 
  {
	  System.out.println("find webElement");
  }
  
}
