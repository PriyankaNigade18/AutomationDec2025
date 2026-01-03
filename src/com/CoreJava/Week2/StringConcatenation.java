package com.CoreJava.Week2;

public class StringConcatenation {

	public static void main(String[] args)
	{
		/*
		 * String Is Immutable Class in java
		 * String is collection/array of characters
		 * In Java String is non primitive
		 * 
		 * + with String always it merge/concat the values
		 */
		String s1="Hello";//{'H','e','l','l','o'}
		String s2="1234";//{'1','2','3','4'}
		String s3="";//empty
		String s4="56.78";
		String s5=" ";
		
		int a=77;
		int b=100;
		
		char ch1='A';
		char ch2='B';
		
		
		//length()
		System.out.println("----lenght()------");
		System.out.println(s1.length());//5
		System.out.println(s3.length());//0
		System.out.println(s5.length());//1
		
		System.out.println("-----charAt(index)-------");
		System.out.println(s1.charAt(3));//l
		System.out.println(s1.charAt(0));//'H'
		
		
		System.out.println(s1);//Hello
		System.out.println(s1+1000);//Hello1000
		System.out.println(a+b);//177
		System.out.println(a+b+s1);//177Hello
		System.out.println(s1+a+b);//Hello77100
		
		System.out.println("----------------");
		System.out.println(s2+1000);//12341000
		System.out.println(s3+s4+1000);//56.781000
		
		System.out.println(ch1+ch2);//Ascii values addition (65+66)=131
		
		//for 131 check character (char)
		System.out.println((char)131);//blank as no char value for 131
		
		char ch3='A';
		String s6="B";
		System.out.println(ch3+s6);//AB
		
		System.out.println((char)90);//Z
		
		//A wanted to check ascii A=65 use int as type
		System.out.println((char)65);//A
		System.out.println((int)ch3);//65
		
		
		
		
		
		
		
			
		
		
		
		
		
		

	}

}
