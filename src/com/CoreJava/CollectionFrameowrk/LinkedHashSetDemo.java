package com.CoreJava.CollectionFrameowrk;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet is extends HashSet and implement Set interface
 * Underline data structure Doubly linked list
 * It is order collection
 * Duplication not allowed
 * 
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{

		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(50);
		hs.add(null);
		
		System.out.println(hs);
		
		
		//Remove duplicate elements from ArrayList/LinkedList
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		//to remove duplicate elements we can convert arraylist into linkedhashset
		/*
		 * for conversion
		 * ------------------
		 * 1.constructor
		 * 2.addAll()
		 */
		
		//using constructor
		
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>(al);
		System.out.println(link);
		
		//using addAll()
		LinkedHashSet<Integer> link2=new LinkedHashSet<Integer>();
		link2.addAll(al);
		
		System.out.println(link2);
		
		
		
		
		
		

	}

}
