package com.CoreJava.Week3.Constructor;

/*
 * this keyword can be passed as an argument in the method call.

 */
public class ThisKeywordDemo3
{
	public void accept(int amount)//1 parameter
	{
		System.out.println("Amount is: "+amount);
	}
	
	
	public void show(ThisKeywordDemo3 t)
	{
		t.accept(5000);
	}
	
	
	public void display()
	{
		//accept(500);//argument(real data)
		show(this);
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo3 t1=new ThisKeywordDemo3();
		t1.display();
		//t1.accept(1000);
		
		//t1.show(t1);

	}

}
