package com.TestNG.Basics1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc75_TimeOutParameter
{
  @Test(priority=1,timeOut = 5000)
  public void register() throws InterruptedException {
	  System.out.println("Registration process");
	  Thread.sleep(4000);
  }
  
  @Test(priority=2,timeOut = 3000)
  public void login() throws InterruptedException {
	  System.out.println("login process");
	  Thread.sleep(6000);//login() didn't finish within the time-out 3000
  }
}
