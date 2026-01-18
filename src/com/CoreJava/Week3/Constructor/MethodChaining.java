package com.CoreJava.Week3.Constructor;

/*
 * this keyword can be used to return the current class instance from the method.

 */
public class MethodChaining
{

	//method--->Object
	public MethodChaining start()
	{
		System.out.println("Open Browser.....");
		return this;
	}
	
	//method --->object
	public MethodChaining run()
	{
		System.out.println("Execute Application.....");
		return this;
	}
	
	//method
	public EmployeeData stop()
	{
		System.out.println("Stop Browser.....");
		
		return new EmployeeData();
	}
	
	public static void main(String[] args) 
	{
		MethodChaining m1=new MethodChaining();
		m1.start().run().stop().show();
		
		//m1.start().run().stop();
//		m1.run();
//		m1.stop();

	}

}
