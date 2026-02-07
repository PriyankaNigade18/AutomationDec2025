package com.CoreJava.Array_String;


public class String_Buffer_Builder
{

	public static void main(String args[])
	{
		
		/*
		 * String in an Immutable class
		 * StringBuffer and StringBuilder both are predefined classes and Mutable
		 * StringBuffer is thread safe(at a time one process it can handle)
		 * StringBuilder is not thread safe(at a time multiple process it can handle)
		 * we can declare using new keyword
		 * StringBuilder is faster and efficient than StringBuffer class
		 * 
		 */
		
		StringBuilder s1=new StringBuilder("Hello");
		System.out.println(s1);//Hello
		s1.append("All");
		System.out.println(s1);//HelloAll
		
		//Reverse string using method in java
		StringBuilder s2=new StringBuilder("Java selenium");
		System.out.println(s2.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
