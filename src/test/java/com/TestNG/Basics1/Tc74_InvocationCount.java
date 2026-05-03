package com.TestNG.Basics1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc74_InvocationCount {
	@Test(priority=1)
	  public void registerTest() {
		  System.out.println("User registration completed!");
	  }
	  
	  
	  @Test(priority=2,invocationCount = 3)
	  public void loginTest() {
		  System.out.println("User login completed!");
	  }
	  
	  
	  @Test(priority=3)
	  public void logoutTest() {
		  System.out.println("User logout completed!");
	  }
	  
	  
}
