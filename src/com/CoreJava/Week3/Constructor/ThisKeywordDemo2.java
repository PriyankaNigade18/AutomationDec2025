package com.CoreJava.Week3.Constructor;

public class ThisKeywordDemo2 {

	//this() can be used to invoke current class constructor.
	//constructor call always first line of that constructor
	
	public ThisKeywordDemo2()
	{
		//this("Hello");
		System.out.println("This is default constructor calling....");
		
	}
	
	public ThisKeywordDemo2(String msg)
	{
		this();
		System.out.println("This is parameterized constructor.."+msg);
	}
	
	public static void main(String[] args)
	{

		ThisKeywordDemo2  t1=new ThisKeywordDemo2("Hello");

	}

}
