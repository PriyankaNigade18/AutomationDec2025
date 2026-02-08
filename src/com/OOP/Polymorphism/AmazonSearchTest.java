package com.OOP.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{

		AmazonSearch s=new AmazonSearch();
		s.search("Mobile");
		s.search(70000);
		s.search(90000,"hp");
		s.search("watch",60000);
		s.search("laptop","hp");
		s.search("Bag","Zara",8000);
		
	}

}
