package com.CoreJava.ControlFlowStatements;

/*
 * break:
 * -------------
 * break will exit from loop and switch case
 * 
 * continue:
 * -------------------
 * continue statement will skip certain part of program and continue with next iteration
 * 
 * return:
 * --------------
 * return help you to return output/result from method
 */
public class Branchingstatements 
{
	
	public String info()
	{
		String data="Selenium is webUi automation library";
		return data;
	}
	
	

	public static void main(String[] args) 
	{

		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;//1 2 3 4
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------");

		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------");

		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip that i and it will continue
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println("-------------------");

		Branchingstatements bs=new Branchingstatements();
		String res=bs.info();
		System.out.println(res);
		
	}

}
