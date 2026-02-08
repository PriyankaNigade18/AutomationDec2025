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
 * 
 * 
 */
public class AmazonSearch {

	
	public void search(String pname)
	{
		System.out.println("Product search by product name: "+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Product search by product price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product search by product name: "+pname+" & brand name: "+bname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product search by product name: "+pname+" & price: "+price);
	}
	
	public void search(int price,String bname)
	{
		System.out.println("Product search by product price: "+price+" & brand name: "+bname);
	}
	
	public void search(String pname,String bname,int price)
	{
		System.out.println("Product search by product name: "+pname+" & brand name: "+bname+" & price: "+price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
