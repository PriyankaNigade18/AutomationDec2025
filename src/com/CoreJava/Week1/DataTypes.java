package com.CoreJava.Week1;

public class DataTypes {

	public static void main(String[] args)
	{
		System.out.println("------Primitive Data types------");
		System.out.println("-------Boolean type------");
		//boolean data 1bit true/false
		boolean status=true;
		System.out.println("Boolean data is: "+status);//true
		status=false;
		System.out.println("Updated status is: "+status);//false
		
		boolean newStatus=true;
		System.out.println("Boolean data is: "+newStatus);
		
		System.out.println("-------Numeric-->character--------");
		/*
		 * any single character or special character we can store using char type
		 * 2byte memory
		 * 
		 * 1.alphabets
		 * 2.special character
		 * 3.Uni-code value/ASCII
		 * 
		 *  A-Z=65 to 90
		 *  a-z=97 to 122
		 *  0-9=48 to 57
		 */
		
		char ch1='A';
		char ch2='@';
		char ch3=122;//z
		char ch4='s';
		char ch5=99;//ch5 accept number as ascii number and return you its character for ascii number
		
		System.out.println("character data is: "+ch1);//A
		System.out.println("character data is: "+ch2);//@
		System.out.println("character data is: "+ch3);//z
		System.out.println("character data is: "+ch4);//s
		System.out.println("character data is: "+ch5);//c
		
		System.out.println("-------Numeric-->Integral--->Integer--------");
		
		//byte--->short--->int(default)--->long
		
		//byte 1byte -128 to 127
		
		
		byte b1=125;
		byte b2=127;
		byte b3=-127;
		//byte b4=130;//Type mismatch: cannot convert from int to byte
		System.out.println("Byte data is: "+b1);
		System.out.println("Byte data is: "+b2);
		System.out.println("Byte data is: "+b3);
		
		//short 2byte -32768 to 32767
		short s1=-32768;
		short s2=32767;
		short s3=30000;
		//short s4=50000;//Type mismatch: cannot convert from int to short
		System.out.println("short data is: "+s1);
		System.out.println("short data is: "+s2);
		System.out.println("short data is: "+s3);
		
		//int 4byte
		
		int i1=50000;
		int i2=786875656;
		//int i3=9999999999999;//The literal 9999999999999 of type int is out of range 
		
		System.out.println("int data is: "+i1);
		System.out.println("int data is: "+i2);
		
		//long 8byte
		long l1=9999999999999L;
		System.out.println("long data is: "+l1);
		
		
		System.out.println("-------Numeric-->Integral--->Floating point--------");
		/*
		 * Floating point
		 * -----------------
		 * 1.float: 4byte  after decimal point we can add almost 6 to 7 numbers
		 * 2.double(default):8byte after decimal point we can add almost 15 to 16 numbers
		 */
		
		double d1=89.67698798708098;
		System.out.println("Double type data: "+d1);
		
		float f1=66.5676878F;
		float f2=45.34F;
		
		System.out.println("Float type data: "+f1);
		System.out.println("Float type data: "+f2);
		
		
		
		//save personal number/adhar card number/credit/debit card number:String type
		
		//long phno1=9552671595L;//8byte
		
		//100 students numbers
	
		String phno1="9552671595";
		System.out.println(phno1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
