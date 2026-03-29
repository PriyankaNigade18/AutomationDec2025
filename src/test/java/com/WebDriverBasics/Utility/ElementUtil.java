package com.WebDriverBasics.Utility;

import java.util.List;

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
	

}
