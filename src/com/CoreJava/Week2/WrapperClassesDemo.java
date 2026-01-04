package com.CoreJava.Week2;

public class WrapperClassesDemo {

	public static void main(String[] args)
	{
		/*
		 * Wrapper classes use to convert primitive data into Object
		 * 1.Primitive to Object
		 * 2.Object to Primitive
		 */
		
		System.out.println("---primitive data to Object------");
		//int to Integer
		int i1=100;
		System.out.println(i1);
		Integer i1Obj=Integer.valueOf(i1);
		System.out.println(i1Obj);
		
		//double to Double
		double marks=89.77;
		Double marksObj=Double.valueOf(marks);
		System.out.println(marksObj);
		
		
		//char into Character
		char ch='p';
		Character chObj=Character.valueOf(ch);
		
		System.out.println("---Object to primitive------");
		
		Integer i=6768;
		int i2=i.intValue();
		System.out.println("Integer to int: "+i2);
		byte b1=i.byteValue();
		System.out.println("Integer to byte: "+b1);
		short s1=i.shortValue();
		System.out.println("Integer to short: "+s1);
		long l1=i.longValue();
		System.out.println("Integer to long: "+l1);
		
		
		System.out.println("--------String conversion--------");
		
		String bookPrice="900";
		System.out.println(bookPrice+100);//900100
		//String--->int
		int price=Integer.parseInt(bookPrice);
		System.out.println(price+100);//1000
		
		String studentMarks="88.67";
		System.out.println(studentMarks+11.11);//88.6711.11
		//string to double
		double studMarks=Double.parseDouble(studentMarks);
		System.out.println(studMarks+11.11);//99.78
		
		//String to char
		String gendar="M";
		System.out.println(gendar+'P');//MP
		//char
		char chg=gendar.charAt(0);
		System.out.println(chg+'P');//157 AScii value addition result
		
		
		/*
		 * Bill Testing
		 * ----------------
		 * Test amount should be less than 10000
		 * 
		 */
		
		String bill="Thankyouforyourorder,totalbillis7000";
		//String bill="Thank you for your order, total bill is 7000";
		int i8=bill.indexOf('7');
		System.out.println(i8);
		
		String data=bill.substring(32);
		System.out.println(data);
		
		//extract the number from string: string
		
		//String data=bill.split(" ")[8];
		System.out.println(data);//7000
		System.out.println(data+1000);//70001000
		
		//convert "number" into int number
		int amount=Integer.parseInt(data);
		
		//test it
		if(amount<10000)
		{
			System.out.println("Valid amount...Test pass");
		}
		else
		{
			System.out.println("Invalid amount...Test Fail");
		}
		
		
		
		
		


	}

}
