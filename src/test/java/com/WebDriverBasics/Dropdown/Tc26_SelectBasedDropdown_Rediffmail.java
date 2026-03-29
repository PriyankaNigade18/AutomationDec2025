package com.WebDriverBasics.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc26_SelectBasedDropdown_Rediffmail 
{
	
	
	
  @Test
  public void testDropdown()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  //day
	  WebElement ddEle=driver.findElement(By.className("day"));
	  ElementUtil.selectdropdown(ddEle,"06");
	  
	   //month
	  WebElement monthEle=driver.findElement(By.className("month"));
	  ElementUtil.selectdropdown(monthEle,"APR");
	  
	  //year
	  WebElement yearEle=driver.findElement(By.className("year"));
	  ElementUtil.selectdropdown(yearEle,"2010");
	  
	  
	  /*
	  Select dayDD=new Select(ddEle);
	  System.out.println("Is dropdown support for multiple selection?: "+dayDD.isMultiple());
	  
	  //get the all options
	  List<WebElement> allOptions=dayDD.getOptions();
	  System.out.println("Total Options for dropdown: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("06"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  //month
	  WebElement monthEle=driver.findElement(By.className("month"));
	  Select monthDD=new Select(monthEle);
	  System.out.println("Is dropdown support for multiple selection?: "+monthDD.isMultiple());
	  
	  //get the all options
	  List<WebElement> allOptions2=monthDD.getOptions();
	  System.out.println("Total Options for dropdown: "+allOptions2.size());
	  
	  for(WebElement i:allOptions2)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("APR"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
