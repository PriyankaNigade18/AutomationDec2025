package com.CoreJava.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class AcceptUserInput {

	public static void main(String[] args) throws IOException 
	{
		
			//Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Hello  "+name);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("your age is: "+age);
		
		sc.close();
		
		
		
		
		
		
		
		
		/*Technique2: BufferedReader class
		System.out.println("Enter your age:");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//string to int
		int age=Integer.parseInt(data);
		System.out.println("Your age is : "+age);
		
		
		
		// Technique1: Using System.in input stream
		/*
		 * read() reads a sing byte in the form of char and return int as ascii value
		 
		System.out.println("Enter your age");//20
		int age=System.in.read();//'2'-->ascii 50
		System.out.println("Your age is: "+(char)age);//50-->2
		 */
		
		
	}

}
