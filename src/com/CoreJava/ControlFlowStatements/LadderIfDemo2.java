package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class LadderIfDemo2 {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=sc.nextLine().charAt(0);
		
		if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}else
		{
			System.out.println(ch+" is not vowel");
		}
		
//		String data=sc.nextLine();
//		char ch=data.charAt(0);
		
		//char ch='u';
		/*
		if(ch=='a')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+" is vowel");

		}else if(ch=='i')
		{
			System.out.println(ch+" is vowel");

		}else if(ch=='u')
		{
			System.out.println(ch+" is vowel");

		}else if(ch=='o')
		{
			System.out.println(ch+" is vowel");

		}else 
		{
			System.out.println(ch+" is not vowel");
		}
*/
	}

}
