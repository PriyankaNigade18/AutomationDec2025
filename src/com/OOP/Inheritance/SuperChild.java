package com.OOP.Inheritance;

public class SuperChild extends SuperParent
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("Child id is: "+cid);
		System.out.println("Child Income is: $16000");
	}
	
	public SuperChild()
	{
		super();
		System.out.println("Child class constructor calling.....");
	}
	
	
	public static void main(String[] args)
	{
		//child ref and child object
		SuperChild s1=new SuperChild();
//		s1.parentIncome();
		s1.childIncome();
//		System.out.println(s1.pid);
//		System.out.println(s1.cid);
		

	}

}
