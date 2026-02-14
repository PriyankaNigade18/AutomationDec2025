package com.OOP.Inheritance;

/*
 * What is Inheritance:
 * -------------------------
 * It is process where we can access properties of one class into another class
 * It is an IS-A relation
 * Relations between classes we can maintain using extends keyword
 * 
 * Purpose:
 * --------------
 * For Reusability of the methods
 * To Avoid code duplication
 * To achieve Run time polymorphism
 * 
 * Real time example
 * ---------------------
 * Parent and child relation
 * 
 * How to Implement(Types)
 * -----------------------
 * 1.Single level
 * 2.Multi-level
 * 3.Hierarchical inheritance
 * 
 * 4.Multiple Inheritance
 * 5.Hybrid Inheritance
 * 
 * 
 * Every Parent class can access only parent properties
 * Every child class can access Parent + child properties
 * 
 * Object is super class in Java language and it is from package java.lang
 * 
 * 
 */
class A
{
	public void m1()
	{
		System.out.println("M1() is calling....");
	}
}

class B extends A//Single level Inheritance here A is parent and B is child
{
	public void m2()
	{
		System.out.println("M2() is calling....");
	}
}

class C extends B//Multilevel inheritance here c is child and B is parent
{
	public void m3()
	{
		System.out.println("M3() is calling....");
	}
}
class D extends A //Hierarchical inheritance here D is child and A is parent
{
	public void m4()
	{
		System.out.println("M4() is calling....");
	}
}

//Multiple Inheritance we can not implement using extends keyword(We can implement it using interface)
//class x extends B,D
//{
//	
//}


public class InheritanceDemo {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: Parent class ref and Parent class Object: Parent");
		
//		A a1=new A();
		//a1.m1();//individual
		//Multilevel A<---B(parent)<---C
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		//Hierarchical A class have two child B and D
		A a1=new A();
		a1.m1();//individual
		
		
		
		System.out.println("Scenario2: Child class ref and Child class Object: Parent+Child");
//		B b1=new B();
//		b1.m1();//Inherited
//		b1.m2();//individual 
		//Multilevel A<---B<---C(child)
//		C c1=new C();
//		c1.m1();//inherited
//		c1.m2();//inherited
		//c1.m3();//individual
		
		//Hierarchical A class have two child B and D
		
		B b1=new B();
		b1.m1();//inherited
		b1.m2();//individual
		
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		
		
			
		System.out.println("Scenario3: Parent class ref and Child class Object: Parent");
//		A a2=new B();
//		a2.m1();//individual
		
		//Multilevel A<---B(parent)<---C(child
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//individual
		
		//Hierarchical A class have two child B and D
		A a2=new B();
		a2.m1();//individual
		
		A a3=new D();
		a3.m1();//individual
		
		System.out.println("Scenario4: Child class ref and Parent class Object: Invalid");
		//B b2=new A();//Type mismatch: cannot convert from A to B
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
