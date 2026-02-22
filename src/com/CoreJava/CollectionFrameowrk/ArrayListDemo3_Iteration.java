package com.CoreJava.CollectionFrameowrk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
* ArrayList is class implement List interface
* Underline data structure is Dynamic Array
* It is Order collection
* Duplication allowed
* null values allowed
* ArrayList default capacity is 10 virtual segment
* ArrayList non synchronize(multiple process class can handle)
* Iteration: Simple for loop,For each,iteartor(),listIterator()
*/
public class ArrayListDemo3_Iteration {

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(17);
		al.add(32);
		al.add(87);
		
		
		System.out.println(al);
		System.out.println("-----Iteration using for loop------");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("-----Iteration using foreach loop------");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("-----Iteration using iterator()------");
		/*
		 * al.iterator(); this method returns object of Iterator interface
		 * Iterator interface has two methods
		 * 1.hasNext():Returns true if the iteration has more elements
		 * 2.next():Returns the next element in the iteration.
		 * 
		 *  
		 */
		
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		System.out.println("-----Iteration using listIterator()------");//only for List interface

		ListIterator<Integer> ls=al.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		
		System.out.println("-----------------");
		
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
		
		
		/*
		 * Collection Vs Collections
		 * ---------------------------------
		 * Collection is an interface, Collections is class and it has all static method
		 * 
		 */
		
		System.out.println("------------------------");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		
		//Arrays class:sort the array element

		List<Integer> al2=Arrays.asList(10,80,11,67,22);
		
		System.out.println("-----------------------");
		int arr[]= {10,80,11,67,22};
		for(int i:arr)
		{
			System.out.println(i);
		}
		Arrays.sort(arr);
		System.out.println("After sort....");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		

		
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
