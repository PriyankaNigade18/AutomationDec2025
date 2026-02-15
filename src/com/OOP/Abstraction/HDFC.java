package com.OOP.Abstraction;

public class HDFC implements RBI
{
	
	public void custDetails()
	{
		System.out.println("HDFC.....customer Details()");
	}

	@Override
	public void deposit() {
		System.out.println("HDFC.....deposit()");

		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC.....withdraw()");

		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC.....rateOfInterest=10%()");

		
	}

}
