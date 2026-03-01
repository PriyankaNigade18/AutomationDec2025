package com.CoreJava.CollectionFrameowrk;

import java.util.TreeSet;

/*
 * TreeSet is class implement Sorted Set which extends Set interface
 * Underline data structure is Binary search tree
 * Frequent operation is search
 * Treeeset always return sorted object/elements
 * 
 * 
 */
public class TreeSetDemo {

	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(5);
		ts.add(10);
		ts.add(7);
		ts.add(3);
		ts.add(9);
		ts.add(2);
		ts.add(11);
		ts.add(8);
		ts.add(1);
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.descendingSet());

		System.out.println("headset() returns all less than elements"+ts.headSet(8));
		System.out.println("tailSet() returns all greater than and equals elements:"+ts.tailSet(8));
		System.out.println(ts.subSet(3, 9));
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		
		ts.remove(11);
		
		System.out.println(ts);
	}

}
