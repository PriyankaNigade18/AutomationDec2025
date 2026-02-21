package com.OOP.Abstraction;

//Multiple Inheritance
public class NobleHs implements IMA,USMA
{
	
	public void medicalService()
	{
		System.out.println("NobleHs......MedicalService()");
	}

	@Override
	public void cardioService() {

		System.out.println("NobleHs.....CardioService()");
		
		
	}

	@Override
	public void physioService() {

		System.out.println("NobleHs.....PhysioService()");

		
	}

	@Override
	public void neuroService() {
		System.out.println("NobleHs.....NeuroService()");
		
	}

	@Override
	public void dentalService() {
		System.out.println("NobleHs.....DentalService()");
		
	}

	@Override
	public void covid19TestService() {

		System.out.println("NobleHs.....Covid19TestService()");

		
	}
	

}
