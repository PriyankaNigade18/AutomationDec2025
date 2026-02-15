package com.OOP.Abstraction;

//this is abstract class
/*
 * Any class design with abstract keyword is called abstract class
 * Abstract class can have both implemented and non implemented method
 * 
 * Method without body is abstract method
 * As abstract class is not fully implemented so you can not create object of this class
 * 
 * To access methods  or implement abstract method from abstract class  we need child class
 * 
 * child class has to implement all the non implemented method from abstract class
 * 
 */
public abstract class Page 
{

	//implemented
	public void getTitle()
	{
		System.out.println("This is page title");
	}
	//implemented
	public void getUrl()
	{
		System.out.println("This is page url");
	}
	
	//non implemented (Abstract method)
	public abstract void getElement();
	
	
	
	public static void main(String args[])
	{
		//Cannot instantiate the type Page
		//Page p1=new Page();
		
	}
	
}
