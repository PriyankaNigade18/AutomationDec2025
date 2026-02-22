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
public class CollectionMethodsArrayListDemo2 {

	public static void main(String[] args) 
	{

		ArrayList<String> loc=new ArrayList<String>();
		System.out.println("Is list empty?: "+loc.isEmpty());//true
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Delhi");
		loc.add("Nashik");
		System.out.println("After adding elements Is list empty?: "+loc.isEmpty());//false
		System.out.println("Total locations are: "+loc.size());//4
		System.out.println(loc);
		loc.add(0,"Satara");
		
		System.out.println(loc);
		loc.add(null);
		System.out.println(loc);
		
		
		
		//remove
		loc.remove(5);//null
		System.out.println(loc);//[Satara, Pune, Mumbai, Delhi, Nashik]
		
		
		//search Mumbai:contains()
		System.out.println("look for Mumbai?:"+loc.contains("Mumbai"));//true
		
		System.out.println("First Location from list: "+loc.getFirst());
		System.out.println("Last location from list: "+loc.getLast());
		
		//specific location: get(index)
		System.out.println("Location at 3rd index: "+loc.get(3));
		//clear 
		
		loc.clear();
		System.out.println(loc);//[]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
