package com.WebDriverBasics.DatePicker_WebTableAutomation_3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tc39_StaticWebTableAutomation {
  @Test
  public void testTable()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  System.out.println("Get the heading and print the heading in console");
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	  
	  System.out.println("Total Headings are: "+allHeadings.size());//4
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("-----Get the number of rows-----");
	  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Total Rows are: "+rows);//7
	  
	  System.out.println("-----Get the number of Columns----");
	  int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	  System.out.println("Total number of columns are: "+columns);//4
	  
	  System.out.println("-----Get the specific row like row 5-----");
	  List<WebElement> specRow=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td"));
	  for(WebElement i:specRow)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("-----Get the specific coulmns like Author name-----");
	  
	  List<WebElement> specCell=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	  for(WebElement i:specCell)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("get all books price and calculate total");
	  
	  
	  List<WebElement> allBookPrice=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));
	  
	  int total=0;
	  for(WebElement i:allBookPrice)
	  {
		  //i webelement into int
		 String price= i.getText();
		 
		 int numPrice=Integer.parseInt(price);
		  
		  total=total+numPrice;
	  }
	  
	  System.out.println("Total Books price is: "+total);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
