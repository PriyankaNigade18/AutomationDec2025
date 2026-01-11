package com.CoreJava.Week3;

public class ParameterPassingWithReturn 
{
	/*
	 * return keywords
	 * -------------------
	 * - return keyword help to return data/outcome from method
	 * - return keyword returns data to its calling function
	 * - when method returns data then method return type should be same as its type of data
	 * - return statement is always last statement of that method
	 * - at a time one info/data we can return
	 */
	public void show()
	{
		System.out.println("Hello.....");
	}
	
	public String info(String mesg)
	{
		return mesg;
	}

	public int calculation(int a,int b)
	{
//		int c=a*b;
//		return c;
		return a*b;
		
	}
	public boolean getStatus(boolean value)
	{
		return value;
	}
	
	public static void main(String[] args) 
	{
		ParameterPassingWithReturn p1=new ParameterPassingWithReturn();
		p1.show();
		String result=p1.info("Selenium WebDriver is WebUi automation api");
		System.out.println(result);
		
		int res=p1.calculation(10,100);
		System.out.println("Multiplication is: "+res);
		
		boolean data=p1.getStatus(true);
		System.out.println(data);

	}

}
