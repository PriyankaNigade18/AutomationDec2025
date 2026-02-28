package com.CoreJava.CollectionFrameowrk;

import java.util.Vector;

/*
 * Vector is class implement List interface 
 * It is order collection
 * duplication is allowed
 * Based on indexing 
 * Underline data structure is Dynamic array
 * It is synchronize(at a time only one process it can rub)/thread safe
 * Performance wise vector is slow 
 */
public class VectoDemo {

	public static void main(String[] args) 
	{

		Vector<Integer> v1=new Vector<Integer>();
		v1.add(10);
		v1.add(87);
		v1.add(34);
		v1.add(67);
		v1.add(15);
		v1.add(10);
		
		
		System.out.println(v1);
		System.out.println("Is vector Empty?: "+v1.isEmpty());//false
		System.out.println("Total elements are: "+v1.size());//5
		
		System.out.println("Search for 50?: "+v1.contains(50));//false
		v1.add(0,90);
		
		System.out.println(v1);
		
		System.out.println("-----iterate------");
		
		for(Integer i:v1)
		{
			System.out.println(i);
		}
		
		
		

	}

}
