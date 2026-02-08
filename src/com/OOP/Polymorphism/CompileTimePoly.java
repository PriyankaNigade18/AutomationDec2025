package com.OOP.Polymorphism;
/*
 * Polymorphism
 * ------------------
 * One thing in multiple form is polymorphism
 * 
 * Purpose:
 * -------------
 * Method Reusability
 * 
 * Types:
 * ------------
 * 1.Compile time polymorphism(Method Overloading)
 * 2.Run time Polymorphism(Method Overriding)
 * 
 * Real time example
 * ------------------
 * communication,payment,search,uber/ola(booking)
 * 
 * Method Overloading
 * -------------------
 * Method can be overloaded only when method has same name 
 * and different signature declared in same class.
 * 
 * different signature
 * ----------------------
 * 1.Number of argument
 * 2.type of argument
 * 3.order of argument
 * 
 * How to implement 
 * ---------------------
 * Using method overloading and overriding we can implement polymorphism
 * 
 * 
 * Main() can be overloading/overriding?
 * =========================================
 * Main() overloading is possible but practically we never used
 * 
 * Main() Overriding is not possible
 * 
 * 
 *  
 *  Constructor Overloading/overriding?
 *  ============================================
 * Constructor overloading is possible and it is called Constructor chaining also.
 * Constructor overriding is not possible
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class CompileTimePoly 
{

	public void add()//0 parameter
	{
		int a=100,b=20;
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.number of arguments
	public void add(int a,int b)//2 parameters
	{
	System.out.println("Addition is: "+(a+b));

	}
	
	public void add(int a,int b,int c)//3 parameters
	{
		System.out.println("Addition is: "+(a+b+c));

	}
	
	//2.type of arguments
	public void add(double a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	//3.order of arguments
	public void add(int a,double b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	
	public static void main(String[] args)
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(200.22,80);
		c1.add(56,909.90);
		c1.add(500,5660);
		c1.add(10,50,90);
		
		
		
		
		
		
		
				
	}

}
