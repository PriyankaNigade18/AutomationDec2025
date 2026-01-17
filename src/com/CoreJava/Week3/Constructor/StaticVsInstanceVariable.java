package com.CoreJava.Week3.Constructor;

public class StaticVsInstanceVariable {

	//instance variable
	//int count=1;
	
	//static
	static int count=1;
	
	public StaticVsInstanceVariable()
	{
		System.out.println(count);
		count++;
	}
	
	
	public static void main(String[] args)
	{
		 StaticVsInstanceVariable s1=new StaticVsInstanceVariable();
		 StaticVsInstanceVariable s2=new StaticVsInstanceVariable();
		 StaticVsInstanceVariable s3=new StaticVsInstanceVariable();
		 StaticVsInstanceVariable s4=new StaticVsInstanceVariable();
		 StaticVsInstanceVariable s5=new StaticVsInstanceVariable();
		 

	}

}
