package com.CoreJava.Week3.Constructor;

public class EmployeeData 
{
	//data
	int empId;
	String empName;
	
	//default 
	public EmployeeData()
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	
	//parameterized
	public EmployeeData(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		
	}
	
	public void show()
	{
		System.out.println(empId);
		System.out.println(empName);
	}
	

	public static void main(String[] args) 
	{

		EmployeeData e1=new EmployeeData();//default constructor
		
		
		EmployeeData e2=new EmployeeData(101,"Pooja");
		e2.show();

		
		EmployeeData e3=new EmployeeData(201,"Amit");
		e3.show();
	}

}
