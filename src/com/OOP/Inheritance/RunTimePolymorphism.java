package com.OOP.Inheritance;

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
 * Run time polymorphism
 * --------------------------
 * To implement run time polymorphism classes must be in Is-A relation
 * 
 * It is also referred as Method overriding
 * 
 * Method Overriding means we can have same name method with same syntax 
 * in parent and child class then child class always override parent class method so 
 * that you will get updated result.
 * 
 *  
 * 
 * 
 */



class Parent
{
	public void color()
	{
		System.out.println("Yellow");
	}
}

class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Blue");
	}
}


public class RunTimePolymorphism {

	public static void main(String[] args)
	{

		//parent class ref and parent class object
		Parent p1=new Parent();
		p1.color();//yellow
		
		
		//child class ref and child class object
		Child c1=new Child();
		c1.color();//blue
		
		//parent ref and child object
		
		Parent p2=new Child();
		p2.color();//Blue
		
		
		
		
		
		
		
	}

}
