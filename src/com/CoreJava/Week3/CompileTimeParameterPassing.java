package com.CoreJava.Week3;

public class CompileTimeParameterPassing
{
	/*
	 * Parameter Passing
	 * ---------------------
	 * We can pass parameters to method so that method will become dynamic
	 * 1.Compile time parameter passing
	 * 2.Run time parameter passing
	 * 
	 * 
	 */
	
	public void addition()//0 parameter method
	{
		int a=100,b=20;//local
		System.out.println("Addition(): "+(a+b));
	}
	
	//parameterized method
	public void add(int a,int b)//2 parameter method here a & b are local variable
	{
		System.out.println("add(): "+(a+b));
	}

	

	public static void main(String[] args)
	{

		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.addition();
		c1.addition();
		/*
		 * Compile time parameter passing
		 * ----------------------------------
		 * When we pass arguments(real data) at the time of calling that method is called 
		 * compile time parameter passing
		 */
		
		c1.add(500,700);//2 arguments
		c1.add(56,70);


	}

}
