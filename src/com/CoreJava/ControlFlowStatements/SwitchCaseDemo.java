package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) 
	{

		char ch='u';
		
		switch (ch)
		{
		case 'a':
			System.out.println(ch+" is vowel");
			break;//exit from switch
		case 'e':
			System.out.println(ch+" is vowel");
			break;
		case 'i':
			System.out.println(ch+" is vowel");
			break;
		case 'o':
			System.out.println(ch+" is vowel");
			break;
		case 'u':
			System.out.println(ch+" is vowel");
			break;
		default:
			System.out.println(ch+" is not vowel");
			
		}
		System.out.println("done!");
		
		
		
		//real time use case
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test case is executing on chrome!");
			break;
		case "firefox":
			System.out.println("Test case is executing on Firefox!");
			break;
		case "edge":
			System.out.println("Test case is executing on Edge!");
			break;
		default:
				System.out.println("Wrong browser name!");
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
