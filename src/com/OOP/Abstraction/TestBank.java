package com.OOP.Abstraction;

public class TestBank {

	public static void main(String[] args)
	{

		//parent ref and parent object
		//RBI r1=new RBI();//Cannot instantiate the type RBI
		
		System.out.println("Child class ref and child class object");
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposit();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		
		System.out.println("------------");
		Axis a1=new Axis();
		a1.custDetails();//individual
		a1.deposit();//inherited abstract method
		a1.withdraw();//inherited abstract method
		a1.rateOfInterest();//inherited abstract method
		
		System.out.println("Parent ref and child object");

		RBI r1=new HDFC();
		r1.deposit();
		r1.withdraw();
		r1.rateOfInterest();
	}

}
