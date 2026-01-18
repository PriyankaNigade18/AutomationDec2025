package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args)
	{

		//true/false
		
		
		//accept two number and compare greater
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		
		
		
		
		/*
		//age validation
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid User");
		}else
		{
			System.out.println("Invalid user");
		}
*/
	}

}
