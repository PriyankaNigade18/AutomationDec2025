package com.OOP.Abstraction;

public class Axis implements RBI 
{
	
	public void custDetails()
	{
		System.out.println("Axis.....Customer details()");
	}

	@Override
	public void deposit() {
		System.out.println("Axis...deposit()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axis...withdraw()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Axis...rateofinterest =8%()");
		
	}

}
