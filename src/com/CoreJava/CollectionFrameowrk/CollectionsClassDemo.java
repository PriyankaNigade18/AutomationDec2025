package com.CoreJava.CollectionFrameowrk;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

	public static void main(String[] args) 
	{

		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(200);
		al.add(100);
		
		System.out.println(al);
		
		System.out.println("Max object from list?:"+Collections.max(al));
		
		System.out.println("min object from list?: "+Collections.min(al));
		
		Collections.sort(al);
		
		System.out.println(al);
		
		//new list
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.addAll(al);
		
		System.out.println(list2);
		
		//copy:both list should have same size
		
		ArrayList<Integer> src=new ArrayList<Integer>();
		src.add(10);
		src.add(20);
		
		System.out.println(src);
		
		ArrayList<Integer> resultList=new ArrayList<Integer>();
		resultList.add(0);
		resultList.add(0);
		
		Collections.copy(resultList,src);
		
		System.out.println(resultList);
		
		
		
	}

}
