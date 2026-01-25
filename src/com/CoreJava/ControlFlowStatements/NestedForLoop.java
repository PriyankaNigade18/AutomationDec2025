package com.CoreJava.ControlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args)
	{
		// table of 2
		int num=7;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
		System.out.println("-------------------");
		
		for(int no=1;no<=10;no++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(no*i+"\t");//tab space
			}
			System.out.println();//next row
		}
		
		System.out.println("-------------------------");
		
		for(int r=1;r<=4;r++)//row
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+"  ");
			}
			System.out.println();
			
		}
		
		System.out.println("-------------------------");

		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
