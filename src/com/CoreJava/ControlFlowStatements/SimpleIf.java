package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) 
	{
		//Simple If is testing true condition
		System.out.println("Start.......");
		//current year
		
		//int year=2026;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		
		if(year==2026)
		{
			System.out.println("Current year match...Year is: "+year);
		}

		
		System.out.println("End......");
	}

}
