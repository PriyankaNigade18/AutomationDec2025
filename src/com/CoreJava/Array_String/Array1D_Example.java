package com.CoreJava.Array_String;
/*/Arrays
===============
Arrays is predefined class in java 

Array is static data structure
Array is collection of similar type of data/Objects
Array size is always fix size
Array implemented in java as Object

Types
==========
1.Single dimension array(1D)
2.Multi dimension array(2D)

Ways to declare array
========================
1. Using new keyword
2. Using literal

Syntax
=============
datatype arrayvariable_name[]=new datatype[size];
*/
public class Array1D_Example {

	public static void main(String[] args)
	{

		int sid[]=new int[5];
		
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Total Ids store into array: "+sid.length);//5
		//single entry
		System.out.println(sid[2]);//
		System.out.println(sid[4]);//105
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		System.out.println("--------------");
		//print complete array
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("-----For each loop------");

		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		String area[]=new String[3];
		area[0]="Pune";
		area[1]="Delhi";
		area[2]="Mumbai";
		
		System.out.println("Total areas: "+area.length);
		//single 
		System.out.println(area[1]);//Delhi
		//iterate
		System.out.println("-----");
		
		for(int i=0;i<area.length;i++)
		{
			System.out.println(area[i]);
		}
		
		System.out.println("-----For each loop------");

		for(String i:area)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------");

		double marks[]=new double[4];
		marks[0]=67.56;
		marks[1]=77.56;
		marks[2]=67.56;
		marks[3]=87.56;
		
		System.out.println("Total marks entries: "+marks.length);
		System.out.println("Total: "+(marks[0]+marks[1]+marks[2]+marks[3]));
		System.out.println("-----");

		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("-----For each loop------");

		for(double i:marks)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------");

		
		//array can store objects as well
		Object empData[]=new Object[5];
		empData[0]="Sarang";
		empData[1]="Pune";
		empData[2]=30;
		empData[3]='M';
		empData[4]=89.78;
		
			
		
		for(int i=0;i<empData.length;i++)
		{
			System.out.println(empData[i]);
		}
		
		
		System.out.println("-----For each loop------");

		for(Object i:empData)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
