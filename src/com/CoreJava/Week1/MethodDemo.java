package com.CoreJava.Week1;

public class MethodDemo 
{
	/*
	 * Instance method we need object to call
	 * Static method inside same class you can call direct
	 * Static method in other class call it by its class name 
	 */
	public void accept()
	{
		System.out.println("This is instance method calling....");
	
	}
	
	public static void show()
	{
		System.out.println("This is static method calling....");
	}
	
		

	public static void main(String[] args)
	{

		show();
		MethodDemo.show();
		//To call instance method /variable we need object
		
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method show() from the type MethodDemo should be accessed in a static way
		//m1.show();
		
		

	}

}
