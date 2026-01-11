package com.CoreJava.Week3;

public class StackOverFlowExample 
{
	public void m1()
	{
		System.out.println("M1 is calling.....");
		//calling m2
		m2();
	}

	public void m2()
	{
		System.out.println("M2 is calling.....");
		m3();
	}

	
	public void m3()
	{
		System.out.println("M3 is calling.....");
		//m1();//java.lang.StackOverflowError
	}

	public static void main(String[] args)
	{
		StackOverFlowExample s1=new StackOverFlowExample();
		s1.m1();
		//s1.m2();
		//s1.m3();

	}

}
