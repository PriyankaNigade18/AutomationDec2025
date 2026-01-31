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

Syntax for 1D
=============
datatype arrayvariable_name[]=new datatype[size];
datatype arrayvariablename[]={};

Synatx for 2D
======================
datatype arryname[][]=new datatype[rowsize][cellsize];

datatype arrayname[][]={{10,20},{10,20},{10,20},{10,20}}




*/
public class MultiDArray_Example {

	public static void main(String[] args)
	{
/*
		int arr[][]=new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		*/
		
		int arr[][]= {{10,20,30},{40,50,60}};
		
		
		System.out.println("Total number of rows: "+arr.length);//2
		System.out.println("Total number of columns: "+arr[0].length);//3
		
		//single entry
		System.out.println(arr[0][1]);//20
		System.out.println(arr[1][1]);//50
		//System.out.println(arr[0][3]);//ArrayIndexOutOfBoundsException
		
		
		System.out.println("----------Using for loop--------------");
		
		
		for(int i=0;i<arr.length;i++)//row
		{
			for(int j=0;j<arr[i].length;j++)//cell
			{
				System.out.print(arr[i][j]+"   ");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("------Using for each loop-----------");
		
		for(int i[]:arr)//Type mismatch: cannot convert from element type int[] to int
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------");
		
		//real data type should be Object
		
		Object data[][]= {{"username","Password"},{"Admin","admin123"},{"Sneha","sneha123"},{"kiran","kiran123"},{"Amit","amit123"},{"Prachi","prachi123"}};
		
		System.out.println("Total number of rows: "+data.length);
		System.out.println("Total number of columns: "+data[0].length);
		
		System.out.println("------------including heading-----------");
		
		for(Object i[]:data)
		{
			for(Object j:i)
			{
				System.out.print(j+"\t");//tab space
			}
			System.out.println();
		}
		
		System.out.println("------------excluding heading-----------");

		for(int i=1;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"   ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
