package com.OOP.Inheritance;



//final class Demo
class Demo
{
	final int price=5000;
	
	public final void info()
	{
		//price=price+1000;
		System.out.println("Current price: "+price);
		System.out.println("Hello This is info () for price: "+price);
	}
}
//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{
	//@Override//Cannot override the final method from Demo
//	public void info()
//	{
//		//price=price+1000;//The final field Demo.price cannot be assigned
//		System.out.println("Current price: "+price);
//		System.out.println("Discounted info () for price: "+(price-1000));
//	}
	
	public static void main(String[] args)
	{
		//child ref and child obj
		
		FinalKeywordDemo f1=new FinalKeywordDemo();
		f1.info();

	}

}