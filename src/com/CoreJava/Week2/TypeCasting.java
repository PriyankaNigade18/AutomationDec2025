package com.CoreJava.Week2;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Type Casting
		 * ==============
		 * Conversion of one type data into another type is called type casting
		 * 
		 * Rule
		 * ==========
		 * Type should be compatible and data should be convertable
		 * 
		 * 3 ways
		 * ---------
		 * 1.Primitive to primitive
		 * ================================
		 * 	1.Implicit Casting
		 * -------------------------
		 * 	- It is Automatic conversion by JVM
		 * 	- Small size ---->Large size
		 * 
		 * byte-->short-->int-->long-->float--->double
		 * 
		 * 	2.Explicit Casting
		 * ------------------------
		 * 	- It is Manual casting
		 * 	- We need Casting operator (type)
		 * 	- large size---->small size
		 * 	- data will loss 
		 * 
		 * double-->float-->long-->int-->short-->byte
		 * 
		 * 
		 * Wrapper classes in Java
		 * 2.Object to Primitive
		 * 3.Primitive To Object 
		 */

		
		System.out.println("----Implicit Casting-----------");
		
		
		byte b1=127;//size 1byte
		short s1=b1;//size 2byte
		
		System.out.println("byte to short conversion: "+s1);//127
		
		short s2=32000;//2byte
		int x=s2;//4byte
		
		System.out.println("short to int conversion: "+x);//32000

		int y=9000000;//4byte
		long l1=y;//8byte
		
		System.out.println("int to long conversion: "+l1);//9000000
		
		//char to int
		char ch='A';//2byte
		int i1=ch;//4byte A --->Ascii--->65
		
		System.out.println("character to int conversion: Ascii result : "+i1);//65
		
		//int to float/double(floating point)
		int i2=880000;//4byte
		float f1=i2;
		System.out.println("int to float conversion: "+f1);//880000.0
		
		double d1=i2;
		System.out.println("int to double conversion: "+d1);//880000.0

		
		System.out.println("----------Explicit casting------------");
		
		
		int i3=50000;//4byte
		short s3=(short)i3;//2byte
		System.out.println("int to short explicit conversion: "+s3);//-15536
		
		long l2=80989090L;//8byte
		int k=(int) l2;//4byte
		System.out.println("Long to int explicit conversion: "+k);//80989090
		
		long l3=809890908789789989L;
		int l=(int) l3;
		System.out.println("Long to int explicit conversion: "+l);//-1791240923
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
