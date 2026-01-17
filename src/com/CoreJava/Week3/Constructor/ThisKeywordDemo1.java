package com.CoreJava.Week3.Constructor;

/*
 * this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.

 */
public class ThisKeywordDemo1 
{
	//this can be used to invoke current class method (implicitly)
	
	public void start()
	{
		System.out.println("Browser start....");
		//open();
		this.open();
		
	}
	
	public void open()
	{
		System.out.println("Open application");
		this.stop();
	}
	
	public void stop()
	{
		System.out.println("Browser stop");
		
	}
	

	public static void main(String[] args)
	{
		ThisKeywordDemo1 t1=new ThisKeywordDemo1();
		t1.start();

	}

}
