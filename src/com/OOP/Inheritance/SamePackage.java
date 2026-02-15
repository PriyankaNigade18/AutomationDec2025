package com.OOP.Inheritance;

public class SamePackage {

	public static void main(String[] args)
	{
		System.out.println("Same package through differnt class");
		AccessPermissions a1=new AccessPermissions();
		System.out.println(a1.name);
		System.out.println(a1.id);
		System.out.println(a1.acno);

	}

}
