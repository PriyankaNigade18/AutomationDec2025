package com.OOP.Polymorphism;

public class MainFunctionOverloading {

	
	public static void main(int[] args)
	{
		System.out.println("Main() with int args");
		
		for(int i:args)
		{
			System.out.println(i);
		}


	}
	
	public static void main(int args)
	{
		System.out.println("Main() with int data: "+args);


	}
	
	public static void main(String[] args)
	{
		System.out.println("Main() with string args");
		main(100);
		
		int arr[]={10,20,30};
		main(arr);
		
		
	}
	

}
