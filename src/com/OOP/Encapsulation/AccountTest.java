package com.OOP.Encapsulation;

public class AccountTest {

	public static void main(String[] args)
	{
		AccountCheck ac=new AccountCheck();
		ac.setAmount(2000);
		System.out.println(ac.getAmount());
		
		System.out.println("------------------");
		AccountCheck user2=new AccountCheck();
		user2.setAmount(500);
		System.out.println(user2.getAmount());
		
		
		
		
	}

}
