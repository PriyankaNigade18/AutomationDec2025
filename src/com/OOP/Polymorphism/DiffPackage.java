package com.OOP.Polymorphism;

import com.OOP.Inheritance.AccessPermissions;

//import com.OOP.Inheritance.AccessPermissions;
public class DiffPackage extends AccessPermissions{

	public static void main(String[] args)
	{
		System.out.println("Different package");
		AccessPermissions a1=new AccessPermissions();
		System.out.println(a1.name);
		
		
		//protected data only through its child class

		DiffPackage d1=new DiffPackage();
		System.out.println(d1.name);
		System.out.println(d1.acno);
	}

}
