package com.TestNG.Basics1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Tc76_ExcludeTestusingparameter 
{
	@Test(priority=1)
	  public void registerTest() {
		  System.out.println("User registration completed!");
	  }
	  
	  
	  @Test(priority=2)
	  public void loginTest() {
		  System.out.println("User login completed!");
	  }
	  
	  
	  @Test(priority=3)
	  public void searchTest() {
		  System.out.println("User search completed!");
	  }
	  
	  //exclude
	  @Test(priority=4,enabled=false)
	  public void addToCartTest() {
		  System.out.println("User added product into cart completed!");
	  }
}
