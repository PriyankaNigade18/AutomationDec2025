package com.OOP.Encapsulation;

/*
 * Encapsulation
 * --------------------
 * It is wrapping of data and functions together in a single unit is called Encapsulation
 * 
 * purpose:
 * Data hiding / data security
 * 
 * real time example:
 * class,object,capsul
 * 
 * How to implement?
 * ------------------------
 * we can store private data and to access that private data we use
 * getters and setters public method 
 * 
 * Setter  will help you to set the data
 * Getter will help you to get the data
 */
 class Employee
 {
	private  int id=101;
	private  String name="Kiran";
	private int salary=40000;
	 
	//getters and setters
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//business logic
	public void show()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
		System.out.println("Employee salary is: "+salary);
	}
 }



public class EncapsulationDemo {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		//e1.salary=80000;//The field Employee.salary is not visible
		e1.setSalary(80000);
		System.out.println(e1.getSalary());
		e1.show();
		
		
		
		
		

	}

}
