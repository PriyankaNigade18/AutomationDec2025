package com.CoreJava.Array_String;
/*
 * String is collection of characters
 * String is an immutable class in java from package java.lang
 * String is non primitive
 * 
 * Ways to declare string
 * ========================
 * 1.Using literal
 * 2.Using new keyword
 * 
 * 
 * 1.Using literal
 * Using String literal when string declare them memory will be created 
 * for that string object in SCP(String constant pool)
	String constant pool
-------------------------
 * SCP is special area available in JSV
 * SCP never allowed Duplicate object
 * 
 * 2.Using new keyword(2time )
 * When String object created using new keyword then memory will be created inside
 * heap area of jvm and inside SCP as well
 * 
 */
public class StringDemo1 {

	public static void main(String[] args)
	{
		
		
		String s1="Hello";//literal way
		
		String s2=new String("Hello");//new keyword way
		
		System.out.println(s1==s2);//Comparing string object id: false
		
		String s3="Hello";
		System.out.println(s1==s3);//true
		
		String s4=new String("Hello");
		
		System.out.println(s2==s4);//false
		
		
		
		
		
		
		
		
		

	}

}
