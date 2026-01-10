package com.CoreJava.Week2;

public class OperatorsDemo {

	public static void main(String[] args) 
	{

		System.out.println("-----Arithmetic Operators----");
		
			//+,-,*,/,%
		int a=10,b=2;
		System.out.println("Addition is: "+a+b);//Addition is: 102
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		System.out.println(100+90);//190
		System.out.println(100/9);//11
		
		//System.out.println(100/0);//ArithmeticException: / by zero
		//System.out.println(-100/0);//ArithmeticException: / by zero
		
		System.out.println(90.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		
		System.out.println(-9.0/0);//-Infinity
		//System.out.println(0/0);//ArithmeticException: / by zero
		
		System.out.println(0/0.0);//NaN-not a number
		System.out.println(0.0/0);//NaN
		
		
		System.out.println("----Unary Operator--------");
		/*1.Increment(++) variable value will be incrementing by 1
		 * ------------------
		 * 	postIncrement (a++)
		 * 	preIncrement  (++a)
		 * a=a+1  a=10  a++ ==>11
		 * 
		 * 2.Decrement(--) variable value decrement by 1
		 * -------------------
		 *  postDecrement (a--)
		 *  preDecrement (--a)
		 *  
		 *  a=a-1 a=10 a-- ==>9
		 * 
		 */
		
		//postIncrement: variable value increment but we can get it next time 
		//when we reuse that variable
		int x=100;
		System.out.println(x);//100
		System.out.println(x++);//100
		System.out.println(x);//101
		
		//PreIncrement:Variable value will be increment
		int y=200;
		System.out.println(y);//200
		System.out.println(++y);//201
		
		int k=90;
		System.out.println(k);//90
		System.out.println(k--);//90
		System.out.println(k);//89
		
		int l=689;
		System.out.println(l);//689
		System.out.println(--l);//688
		
		//Interview
		
		int c=90;
		int d=c++;//value will assign first then increment
		System.out.println(c);//91
		System.out.println(d);//90
		
		
		int u=68;
		int v=u++;//value will assign first then increment
		System.out.println(u);//69
		System.out.println(v);//68
		
		
		//pre-increment 
		int m=100;
		int n=++m;//first increment value then assign
		System.out.println(m);//101
		System.out.println(n);//101
		
		int s=290;
		int p=s--;
		System.out.println(s);//289
		System.out.println(p);//290
		
		int r=70;
		int h=--r;
		System.out.println(r);//69
		System.out.println(h);//69
		
		
		System.out.println("------Relational Operators------------");
		/*
		 * Test Data
		 * -----------
		 * m=n=101 r=h=69 c=91 d=90 u=69 v=68
		 */
		
		System.out.println("Less than <: "+(r<m));//true
		System.out.println(v<n);//true
		System.out.println(c<r);//false
		System.out.println("less than equal to <=: "+(h<=c));//true
		System.out.println(r<=u);//true
		System.out.println(m<=d);//false
		System.out.println("Greater than >: "+(c>d));//true
		System.out.println("Greater than equal to >=: "+(m>=n));//true
		System.out.println(u>=d);//false
		System.out.println("Equal to ==: "+(m==n));//true
		System.out.println(r==u);//true
		System.out.println(c==u);//false
		System.out.println("Not equal to !=: "+(c!=d));//true
		System.out.println(v!=r);//true
		System.out.println(r!=h);//false
		
		
		System.out.println("------Logical Operators-------");
		/*
		 * c1		c2			c1&&c2			c1||c2			!c1
		 * ----------------------------------------------------------------
		 * true		true		true			true			false
		 * true		false		false			true			false
		 * false	true		false			true			true
		 * false 	false		false			false			true
		 * 
		 * Test data
		 * --------------
		 * true: r<m  v!=r r==u m==n
		 * false: r!=h  m!=n u>d c==u
		 */
		
		
		System.out.println("----&&------");
		System.out.println((r<m) && (m==n));//true
		System.out.println((v!=r) && (c==u));//false
		System.out.println((m!=n) && (r==u));//false
		System.out.println((m!=n) && (c==u));//false
		
		System.out.println("-----||----");
		
		System.out.println((r<m)  || (m==n));//true
		System.out.println((v!=r) || (c==u));//true
		System.out.println((m!=n) || (r==u));//true
		System.out.println((m!=n) || (c==u));//false
		
		System.out.println("-----!(Not)-----");
		
		System.out.println(m==n);//true
		System.out.println(!(m==n));//false
		
		System.out.println(c==u);//false
		System.out.println(!(c==u));//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
