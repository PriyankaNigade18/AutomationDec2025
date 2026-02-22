package com.CoreJava.CollectionFrameowrk;

import java.util.ArrayList;

/*
 * ArrayList is class implement List interface
 * Underline data structure is Dynamic Array
 * It is Order collection
 * Duplication allowed
 * null values allowed
 * ArrayList default capacity is 10 virtual segment
 * ArrayList non synchronize(multiple process class can handle)
 */
public class ArrayListDemo1
{

	public static void main(String[] args)
	{
		
		
		//Generic way 1.Type safe  2.no type casting required
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(null);
		al.add(400);
		al.add(200);
		al.add(100);
		al.add(null);
		
		
		System.out.println(al);
		
		int number=al.get(0);
		System.out.println(number);
		
		
		
		
		/*
		
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		//Non generic way: 1.It is not type safe 2.Type casting

		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Kiran");
		al.add('I');
		al.add(67.88);
		
		System.out.println(al);
		
		int number=(int) al.get(0);
		System.out.println(number);
		
		*/
		
		
		
		
		
		
	}

}
