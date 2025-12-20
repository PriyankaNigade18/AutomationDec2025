package com.CoreJava.Week1;

public class StudentData 
{	//single line comment in java: data
	int id;
	String name;
	
	//method
	public void show()
	{
		System.out.println("Student Id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String args[])
	{
		/*
		 * How to create Object
		 * To access properties of class we need Object to be create
		 * Syntax:
		 * ------------
		 * className referenceVariableName=new ClassName();
		 */
		
		StudentData s1=new StudentData();
		//s1.show();//default data
	
		s1.id=101;
		s1.name="Sushant";
		s1.show();
		
		System.out.println("--------------");
		
		StudentData s2=new StudentData();
		s2.id=201;
		s2.name="Kiran";
		s2.show();

		System.out.println("--------------");
		
		StudentData s3=new StudentData();
		s3.id=301;
		s3.name="Smita";
		s3.show();
		
		System.out.println("--------------");
		
		StudentData s4=new StudentData();
		s4.id=401;
		s4.name="Abhi";
		s4.show();
		
		System.out.println("--------------");
		StudentData s5=new StudentData();
		s5.id=501;
		s5.name="Pooja";
		s5.show();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
