package com.CoreJava.Week1;

public class VariableDemo
{
	//instance variable
	int id=101;
	String name="Kiran";
	static String cgname="AISSPMS";//static variable
	
	public void display()
	{
		int marks=90;//local variable
		System.out.println("College name is: "+cgname);
		System.out.println("Marks from display(): "+marks);
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
		
		
	}
	

	public static void main(String[] args) 
	{
		int marks=100;//local variable
		System.out.println("Marks from main(): "+marks);
		
		//object
		VariableDemo v1=new VariableDemo();
		v1.display();
		
		System.out.println(v1.id);
		System.out.println(v1.name);
		
		//object
		VariableDemo v2=new VariableDemo();
		System.out.println("College name is: "+cgname);
		


	}

}
