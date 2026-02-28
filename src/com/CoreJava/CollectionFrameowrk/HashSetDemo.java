package com.CoreJava.CollectionFrameowrk;

import java.util.HashSet;

/*
 * HashSet is class implement Set Interface
 * Underline data structure is HashTable
 * HashTable stores the value as per hashing mechanism
 * Where for every object it calculate hashcode,key and index and as per index store value in table
 * Default capacity of table is 16(virtual segment)
 * 
 * 
 * It is not order collection
 * Duplication not allowed
 * 
 * |hashcode|key|object|address of next element|
 * 
 * for null object hashcode and index is 0
 * 
 * If two objects get the same index number then it is called object collision
 * 
 * Explain HashMap or HashSet Internal Mechanism
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) 
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(50);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println("Is set empty?: "+hs.isEmpty());
		System.out.println("Total Elements: "+hs.size() );
		System.out.println("Search for 20?: "+hs.contains(20));//true
		
		//remove
		hs.remove(null);
		
		System.out.println(hs);
		

	}

}
