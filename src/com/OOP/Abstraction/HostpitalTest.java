package com.OOP.Abstraction;

public class HostpitalTest {

	public static void main(String[] args)
	{
		//parent class ref and parent class object
		//IMA i1=new IMA();//Cannot instantiate the type IMA
		
		//Child class ref and child class object : parent +child
		NobleHs n1=new NobleHs();
		n1.medicalService();//individual
		n1.cardioService();//inherited abstract method
		n1.physioService();//inherited abstract method
		n1.dentalService();//inherited abstract method
		n1.neuroService();//inherited abstract method
		n1.covid19TestService();//inherited abstract method
		
		
		System.out.println("-----------------");
		
		//Parent class ref and child class object:parent class
		
		IMA i1=new NobleHs();
		i1.cardioService();//individual
		i1.physioService();//individual
		i1.covid19TestService();
		
		
		System.out.println("-----------------");
		
		USMA u1=new NobleHs();
		u1.dentalService();//individual
		u1.neuroService();//individual
		u1.covid19TestService();
		
		
		
		
		
		
		

	}

}
