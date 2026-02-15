package com.OOP.Inheritance;

public class AccessPermissions 
{
	      int id=111;//default
	public String name="Kiran";
	private long phno=797098098L;
	protected int acno=768654;
	
	
	

	public static void main(String[] args)
	{
		System.out.println("Same class");
		AccessPermissions a1=new AccessPermissions();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
