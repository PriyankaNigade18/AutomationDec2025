package com.CoreJava.CollectionFrameowrk;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap is class implement Map Interface
 * Underline data structure is HashTable
 * HashTable stores the value as per hashing mechanism
 * Where for every object it calculate hashcode,key and index and as per index store value in table
 * Default capacity of table is 16(virtual segment)
 * HashMap where we can store elements as per key and value pair
 * <key,value>
 * In Map every <key,value> pair is referred as Entry
 * What is Entry
 * ----------------
 * Entry is predefined interface for map
 * 
 * 
 * It is not order collection
 * Duplication in key not allowed
 * 
 * As per key we can access value
 * 
 * |hashcode|key|object|address of next element|
 * 
 * for null object hashcode and index is 0
 * 
 * If two objects get the same index number then it is called object collision
 * 
 * Explain HashMap or HashSet Internal Mechanism
 */
public class HashMapDemo {

	public static void main(String[] args)
	{
		
		//area---Map with ---postal code
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("VimanNagar",411014);
		hm.put("Wadgaonsheri",411014);
		hm.put("Lohegaon",411047);
		hm.put("Whagoli",411055);
		
		System.out.println(hm);
		
		System.out.println("total entries: "+hm.size());//4
		System.out.println("Search for key Kharadi?"+hm.containsKey("Kharadi"));//false
		
		System.out.println("Search for key Whagoli?"+hm.containsKey("Whagoli"));//true
		
		System.out.println("Search for value 411047?"+hm.containsValue(411047));//true

		//remove
		hm.remove("Whagoli");
		
		System.out.println(hm);
		
		System.out.println("***********Iterate*******************");
		//Entry interface
		
		for(Map.Entry<String,Integer> i:hm.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		System.out.println("------------");
		
		for(Map.Entry<String,Integer> i:hm.entrySet())
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
