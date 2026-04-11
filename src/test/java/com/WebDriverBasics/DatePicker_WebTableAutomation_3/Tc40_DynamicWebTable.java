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

public class Tc40_DynamicWebTable {
  @Test
  public void testDynamicTable() 
  {
  
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  driver.get("https://testautomationpractice.blogspot.com/");
  
  //scroll upto dynamic table
  WebElement ele=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
  ElementUtil.scrollUptoElement(driver,ele);
  
 
  System.out.println("-----Get All rows-----");
  int rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
  System.out.println("Total number of rows are: "+rows);//5
  
  System.out.println("-----Get All Columns/headings-----");
List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']//thead//tr//th"));
  
System.out.println("Total columns are: "+allHeadings.size());//5

for(WebElement i:allHeadings)
{
	System.out.println(i.getText());
}
  
System.out.println("-----Get Specific Column data-----");


	String expHeading="CPU (%)";
	int cellCount=0;
for(WebElement heading:allHeadings)
{
	cellCount++;
	if(heading.getText().contains(expHeading))
	{
		System.out.println("Heading : "+heading.getText()+" found at column: "+cellCount);
		
		//get the all rows data
		List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+cellCount+"]"));
		
		for(WebElement clData:cellData)
		{
			System.out.println(clData.getText());
		}
	}
	
}



System.out.println("-----Get Specific Row data-----");

	String expHead="Name";
	int rowCount=0;
	for(WebElement heading:allHeadings)
	{
		rowCount++;
		if(heading.getText().contains(expHead))
		{
			System.out.println("Heading: "+expHead+" found at row: "+rowCount);
				List<WebElement> bname=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+rowCount+"]"));
				int row=0;
				for(WebElement browser:bname)
				{ row++;
					if(browser.getText().contains("Firefox"))
					{
						System.out.println("Browser: Firefox found at :"+row);
						List<WebElement> allCell=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr["+row+"]//td"));
							for(WebElement cell:allCell)
							{
								System.out.println(cell.getText());
							}
					}
				}
		}
	}


System.out.println("------Test Scenarios--------");
/*
 * CPU load of Chrome process: 6.0%
 */
  
//first iterate Name and find Chrome
	List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td[1]"));
	int rCount=0;
	for(WebElement name:allNames)
	{
		rCount++;
		if(name.getText().contains("Chrome"))
		{
			System.out.println("Chrome fount at row: "+rCount);
			//get the cpu load for chrome
			String actCPULoad=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+rCount+"]//following-sibling::td[contains(text(),'%')]")).getText();
			String expCPULoad=driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();
			
			
			if(actCPULoad.equals(expCPULoad))
			{
				System.out.println("CPU load match: "+actCPULoad);
			}
		}
		
	}


  
  
  
  
  
  
  
  }
}
