package com.OOP.Abstraction;

public class LoginPageChild extends Page
{

	public void getApp()
	{
		System.out.println("login page...get App()");
	}
	
	@Override
	public void getElement()
	{
		System.out.println("Login page element found!");
		
	}
	
	public static void main(String[] args)
	{
	
		System.out.println("Scenario1: Parent class ref and parent class object: Invalid");
		//Page p1=new Page();
		System.out.println("Scenario2: Child class ref and child class object: parent +child");
		LoginPageChild lp=new LoginPageChild();
		lp.getApp();//individual
		lp.getTitle();//inherited
		lp.getUrl();//inherited
		lp.getElement();//inherited abstract method


	}
	

	

}
