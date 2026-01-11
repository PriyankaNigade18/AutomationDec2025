package com.CoreJava.Week3.Constructor;

/*
 * Constructor is special method used to initialized object
 * Constructor name and class name is same
 * Constructor should not be final,abstract,static
 * type
 * =========
 * 1.default constructor(called JVM)
 * 2.parameterized constructor
 * 
 * this keyword
 * -----------------
 * This keyword refers current class object
 * Current class instance variables and instance methods we can call using this keyword
 */


public class ConstructorTest 
{
	//instance variable
	int id;
	String name;
	
	//default constructor
	public ConstructorTest()
	{
		System.out.println(id);//0
		System.out.println(name);//null
	}
	
	//parameterized constructor
	public ConstructorTest(int id,String name)//local
	{
		//Initializing instance variable
		//this can be used to refer current class instance variable.
		this.id=id;
		this.name=name;
				
	}
	
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		//call
		
		ConstructorTest c1=new ConstructorTest();
		ConstructorTest c2=new ConstructorTest(101,"Kiran");
		c2.show();

	}

}
