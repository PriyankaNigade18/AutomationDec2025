package com.WebDriverBasics.DatePicker_WebTableAutomation_3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebDriverBasics.Utility.ElementUtil;

public class Tc41_PeginationTable {
  @Test
  public void testPeginationTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll upto dynamic table
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
	  ElementUtil.scrollUptoElement(driver,ele);
	  
	  System.out.println("-----Total number of pages-----");
	  List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total Pages are: "+allPages.size());//4
	  
	  System.out.println("-----get total number of rows & columns-----");
	  int totalRows=0;
	  for(WebElement page:allPages)
	  {
		  page.click();
		  System.out.println("For page number: "+page.getText());
		  int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  int cells=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		  
		  System.out.println("Total Rows: "+rows);
		  System.out.println("Total Columns: "+cells);
		  totalRows=totalRows+rows;
	  }
	  
	  System.out.println("Total Rows for all pages: "+totalRows);//20
	  
	  System.out.println("-----get product name for 3rd page-------");
	  
	  for(WebElement page:allPages)
	  {
		  if(page.getText().contains("3"))
		  {
			  //open page
			  page.click();
			  List<WebElement> allProducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			  for(WebElement product:allProducts)
			  {
				  System.out.println(product.getText());
			  }
		  }
	  }
	  
	  
	  
	  System.out.println("----check product name Streaming Device for 4th page-------");
	  
	  for(WebElement page:allPages)
	  {
		  String pname="Streaming Device";
		  if(page.getText().contains("4"))
		  {
			  //open page
			  page.click();
			  List<WebElement> allProducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			  for(WebElement product:allProducts)
			  {
				  if(product.getText().contains(pname))
				  {
					  driver.findElement(By.xpath("//table[@id='productTable']//tbody//td[text()='Streaming Device']//following-sibling::td/input")).click();
				  }
				 
			  }
		  }
	  }
	  
	  
	  
	  
  }
  
  
}
