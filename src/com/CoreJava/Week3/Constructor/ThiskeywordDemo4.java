package com.CoreJava.Week3.Constructor;

/*
 * this keyword can be passed as argument in the constructor call.

 */


class Demo
{
	public Demo(ThiskeywordDemo4 t)
	{
		System.out.println(t.price);
	}
	

}


public class ThiskeywordDemo4 
{
	int price=6000;
	
	public ThiskeywordDemo4()
	{
		Demo d1=new Demo(this);
	}
	
	

	public static void main(String[] args)
	{
		ThiskeywordDemo4 t1=new ThiskeywordDemo4();
		

	}

}
