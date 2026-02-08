package com.OOP.Encapsulation;

public class AccountCheck
{

	private int amount;
	
	public void setAmount(int amount)
	{
		if(amount>=1000)
		{
			System.out.println("Valid amount...Account is activated....!");
			this.amount=amount;
		}else
		{
			System.out.println("Insufficient amount...Add some more amount than "+amount);
			//this.amount=amount;
		}
		
	}
	
	
	public int getAmount()
	{
		return amount;
	}
	
	
	
	
	
}
