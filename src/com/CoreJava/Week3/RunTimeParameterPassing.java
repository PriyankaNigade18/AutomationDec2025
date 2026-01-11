package com.CoreJava.Week3;

import java.util.Scanner;

public class RunTimeParameterPassing 
{
	
	
	public void add(int a,int b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	
	
	public void sub(int a,int b)
	{
		System.out.println("Subtraction is: "+(a-b));
	}

	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{

		RunTimeParameterPassing  r1=new RunTimeParameterPassing ();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();		

		r1.add(num1,num2);
		r1.sub(num1,num2);
		
		
		int result=r1.multiplication(num1,num2);
		System.out.println("Multiplication is: "+result);
				
		
		
		
	}

}
