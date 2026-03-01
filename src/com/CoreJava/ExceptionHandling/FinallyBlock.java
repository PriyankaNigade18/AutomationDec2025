package com.CoreJava.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{
		/*
		 * To place special code(code which is executing with or without exception)
		 * server start/stop process
		 * report generate
		 * 
		 * finally block we can write always with try block
		 * finally block will not handle exception
		 * 
		 */
		
		
		System.out.println("Program started....");
		try {
		System.out.println(9/0);
		}catch(Exception s)
		{
			System.out.println("Add correct input numbers");
		}
		finally 
		{
			System.out.println("Finally block calling...To run special code!");
		}
		System.out.println("Program ends......");
		
		
		

	}

}
