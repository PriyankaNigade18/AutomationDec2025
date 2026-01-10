package com.CoreJava.Week3;

public class AccessModifiers 
{
	//data
	int id=101;//default
	public String name="Sarang";
	private long phno=9876544489L;
	

	public static void main(String[] args)
	{
		System.out.println("-----Same Class-----");
			
		 AccessModifiers a1=new AccessModifiers();
		 System.out.println(a1.id);
		 System.out.println(a1.name);
		 System.out.println(a1.phno);

	}

}
