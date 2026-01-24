package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

/*
 * For loop
 * =============
 * -Number of iterations are fixed
 * Scenarios: menu,list,dropdown,caledar(number of days 30,31)
 * 
 * While loop
 * ================
 * - Entry control loop
 * - number of iterations are not fixed/known 
 * Scenario: dynamic list,dropdown,pegination,pageloadtime
 * 
 * Do-while loop
 * ============
 * -Exit control loop
 * -One time iteration even if condition fail
 * 
 * 
 */
public class LoopDemo {

	public static void main(String[] args)
	{
		// print hello statement 10

		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("-----------------");
		//print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("-----------------");
		//print 10 to 1 numbers
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------");

		//up to 10 print every number square
		
		for(int i=1;i<=10;i++)
		{
			int res=i*i;
			System.out.println("Square of number "+i+"="+res);
		}
		
		System.out.println("-----------------");

		//factorial of number
		//5!=5*4*3*2*1=120
		
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of 5 is: "+fact);
		
		System.out.println("-----------------");
/*
		//interview question
		for(;;)//for loop condition is always true so code will run infinite time
		{
			System.out.println("Hi");
		}
		
		*/
		
		
		//While loop
		
		//print welcome message 10 time
		
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Welcome");
			i++;
		}
		
		
		/*
		 * sum of digits of number
		 * num=123
		 * sum=1+2+3=6
		 * 
		 * num=1234
		 * sum=1+2+3+4=10
		 */
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int temp=sc.nextInt();
		int num=temp;
		int rem,sum=0;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits of "+temp+" is: "+sum);
		*/
		
		
			
		System.out.println("------------------------");
		
		
		
		//accept number and do reverse the number
		
		//1234===>4321
		
		int num=1234,rem,rev=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		
		
		System.out.println("Reverse of "+temp+" is: "+rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
