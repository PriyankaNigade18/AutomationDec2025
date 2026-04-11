package com.WebDriverBasics.Utility;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil 
{
	//Utilities are reusable methods
	public static void selectdropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		  System.out.println("Is dropdown support for multiple selection?: "+dd.isMultiple());
		  
		  //get the all options
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options for dropdown: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
		
		  	}
	
	
	
	//scroll webpage utilities
	public static void scrollDown(WebDriver driver)
	{
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
	
	
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

	}

	
	public static void scrollUptoElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);

		
	}
}
