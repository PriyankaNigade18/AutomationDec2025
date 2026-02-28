package com.CoreJava.CollectionFrameowrk;

import java.util.LinkedList;

/*
 * LinkedList is class implement List interface
 * Underline data structure Doubly linked list
 * frequent operation is insertion and deletion
 * It is order collection 
 * duplication allowed
 * Every linked list based on node structure
 * Singly ll: data|address of next element
 * Doubly ll: address of previous node|data|address of next element
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args)
	{

		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(101);
		ls.add(201);
		ls.add(301);
		ls.add(100);
		ls.add(30);
		ls.add(101);
		ls.add(null);
		
		System.out.println("Total Elements are: "+ls.size());
		System.out.println(ls);
		
		System.out.println("Linked list is empty?: "+ls.isEmpty());//false
		
		
		System.out.println("Linkedlist contains100?: "+ls.contains(100));//true
		
		
		System.out.println(ls.getLast());
		System.out.println(ls.getFirst());
		
		ls.addFirst(90);
		
		System.out.println(ls);
		
		ls.remove(7);//null
		System.out.println(ls);
		
		
		System.out.println("-------------");

		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		
		
		
		
		

	}

}
