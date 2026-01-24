package com.CoreJava.ControlFlowStatements;

public class MethodChainingTest
{
	//method--->Object of current class
	public MethodChainingTest startApp()
	{
		System.out.println("Application started....");
		return this;
	}
	
	public MethodChainingTest findElement()
	{
		System.out.println("Identify WebElements");
		return this;
	}
	
	public MethodChainingTest closeApp()
	{
		System.out.println("Application closed....");
		return this;
	}
	public static void main(String[] args) 
	{

		MethodChainingTest obj=new MethodChainingTest();
		obj.startApp().findElement().closeApp().startApp();
	
//		obj.findElement();
//		obj.closeApp();

	}

}
