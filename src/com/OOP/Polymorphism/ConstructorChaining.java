package com.OOP.Polymorphism;

/*
 * 1.number of arguments
 * 2.type of arguments
 * 3.change order of arguments
 */
public class ConstructorChaining 
{
	//Constructor chaining is constructor overloading

	ConstructorChaining()
	{
		System.out.println("This is default constructor...");
	}
	
	ConstructorChaining(String msg)
	{
		System.out.println("This is Parameterized constructor..."+msg);
	}
	
	ConstructorChaining(int id)
	{
		System.out.println("This is Parameterized constructor..."+id);
	}
	
	ConstructorChaining(String msg,int id)
	{
		System.out.println("This is Parameterized constructor..."+msg+id);
	}
	
	public static void main(String[] args) 
	{
		
		ConstructorChaining c1=new ConstructorChaining();
		ConstructorChaining c2=new ConstructorChaining("Hello");
		ConstructorChaining c3=new ConstructorChaining(90);
		ConstructorChaining c4=new ConstructorChaining("Hello",99);
	}

}
