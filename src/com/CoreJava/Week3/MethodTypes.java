package com.CoreJava.Week3;

public class MethodTypes 
{
	/*
	 * Instance method : We can call only through Object
	 * Static Method: We can call in same class direct(Without class name)
	 * We can call in any other class using className
	 */

	public void accept()
	{
		System.out.println("This is an Instance Method");
	}
	
	public static void display()
	{
		System.out.println("This is static method");
	}
	
	
	public static void main(String[] args) 
	{

		display();
		MethodTypes.display();
		
		MethodTypes m1=new MethodTypes();
		m1.accept();
		//The static method display() from the type MethodTypes should be accessed in a static way
		//m1.display();
		
		
		
		

	}

}
