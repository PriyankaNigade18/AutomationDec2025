package com.CoreJava.CollectionFrameowrk;

import java.util.ArrayList;

public class EmployeeArrayList {

	public static void main(String[] args)
	{

		Employee e1=new Employee(101,"Parag");
		Employee e2=new Employee(102,"Sneha");
		Employee e3=new Employee(103,"Kiran");
		Employee e4=new Employee(104,"Abhijit");
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		//System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).empId+" : "+al.get(i).empName);
			
			
		}

	}

}
