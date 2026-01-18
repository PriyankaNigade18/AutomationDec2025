package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args)
	{
		//for all imports : ctrl+shift+O

		//greater/smaller/equal/0
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		/*
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else if((num1==0 && num2==0)||(num1==num2))
		{
			System.out.println("Both numbers are equal/0");
		}else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		*/
		
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else if(num1==num2)
		{
			System.out.println("Both numbers are equal");
		}else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		
		
		

	}

}
