package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args)
	{

		//true/false
		
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

	}

}
