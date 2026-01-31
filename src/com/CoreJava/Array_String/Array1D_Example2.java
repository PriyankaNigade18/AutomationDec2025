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
public class Array1D_Example2 {

	public static void main(String[] args)
	{
		// Type of declaration: new keyword way
		
		/*
		String language[]=new String[4];
		language[0]="C Programming";
		language[1]="C++ Programming";
		language[2]="Java Programming";
		*/
		
		//literal way
		String language[]= {"C Programming","C++ Programming","Java Programming","Python"};
		
		System.out.println("Total laguages: "+language.length);//4
		
		System.out.println(language[1]);//C++ Programming
		
		System.out.println(language[3]);//null ""
		
		//System.out.println(language[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println("Done!");
		System.out.println("----Iterate using simple for loop----");
		
		for(int i=0;i<language.length;i++)
		{
			System.out.println(language[i]);
		}
		
		System.out.println("-----For each loop------");
		
		for(String i:language)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		
		int sid[]= {101,102,103,104,105};
		
		System.out.println("Total ids: "+sid.length);

		
		System.out.println(sid[3]);//104
		
		System.out.println("----Iterate using simple for loop----");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("-----For each loop------");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		
		System.out.println("----Interview Question----------");
		
		//sum of all array elements
		int num[]={10,20,30,40,50};
		int res=0;
		for(int i:num)
		{
			res=res+i;
		}
		
		System.out.println(res);
		
		System.out.println("------------");
		
		
		//find 28 form this array
		int arr[]= {100,34,56,29,101,55};
		
		int target=28;
		boolean status=false;
		for(int i:arr)
		{
			if(i==target)
			{
				status=true;
				break;
			
			}
			
		}
		
		if(status==true)
		{
			System.out.println(target+" is found");
		}
		else
		{
			System.out.println(target+" is not found");
		}
		
		
		System.out.println("----------------");
		
		//max id from array
		int id[]= {67,23,11,66,200,188};
		
		int max=id[0];
		
		for(int i=1;i<id.length;i++)
		{
			if(id[i]>max)
			{
				max=id[i];
			}
		}
		
		
		System.out.println("Maximun number is: "+max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
