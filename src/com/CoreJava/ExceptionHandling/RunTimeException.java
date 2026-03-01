package com.CoreJava.ExceptionHandling;

import java.util.Scanner;

public class RunTimeException 
{

	int sid=101;
	
	public static void main(String[] args)
	{
		
		RunTimeException r1=new RunTimeException();
		r1=null;
		try {
		System.out.println(r1.sid);//NullPointerExpection
		}catch(NullPointerException n)
		{
			System.out.println("Check that object is null");
		}
		
		
		System.out.println("---------------");
		
		//NumberFormatException - if the string does not contain aparsable integer.
		String s1="100sdas";
		System.out.println(s1+100);//100100
		//string to number-->Wrapper class
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		}catch(Exception e)
		{
			System.out.println("Change the string input as current string is not parsable");
		}
		
		System.out.println("---------------");

		
		
	
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter correct index between 0 to 4");
		int index=sc.nextInt();
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Check the correct index for array value");
		}
		
		*/
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Subtraction is: "+(num1-num2));
		try {
		System.out.println("modulus is: "+(num1%num2));//ArithmeticException
		System.out.println("Division is: "+(num1/num2));//ArithmeticException
		}catch(ArithmeticException r)
		{
			System.out.println("use appropriate numbers than 0");
		}
		System.out.println("Multiplication is: "+(num1*num2));

		
		
		

	}

}
