package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class RealTimeScenario {

	public static void main(String[] args)
	{
		/*
		 * for primitive comparison use operators
		 * For String comparison use string methods
		 * 
		 * String equality
		 * -------------------
		 * 1.equals():look for exact match but it is case sensitive
		 * s1=HELLO
		 * s2=HELLO
		 * 
		 * 2.equalsIgnoreCase():look for exact match but it is not case sensitive
		 * 
		 
		String s1="Playwright is WebUI test Tool";
		String s2="Playwright is WebUI test Tool";
		System.out.println(s1.equals(s2));//true
		String s3="PLAYWRIGHT IS WEBUI TEST TOOL";
		System.out.println(s1.equals(s3));//false
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your browser name");
		String bname=sc.nextLine();
		if(bname.equalsIgnoreCase("chrome"))
		{
		System.out.println("Test case executing on Chrome....");
		}else if(bname.equalsIgnoreCase("Edge"))
		{
			System.out.println("Test case executing on Edge.....");
		}else if(bname.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Test case executing on Firefox...");
		}
		else
		{
			System.out.println("Please provide appropriate browser name!");
		}
		

	}

}
