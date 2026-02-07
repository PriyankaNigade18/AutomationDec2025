package com.CoreJava.Array_String;

public class StringMethods {

	public static void main(String[] args)
	{
		//length()
		String s1="Hello All ";
		System.out.println("Length is: "+s1.length());
		
		/*
		 * equality between string
		 * 1.equals():look for exact match and it is case sensitive
		 * 2.equalsIgnoreCase():look for exact match and it is not case sensitive
		 */
		
		
		String s2="Welcome to learn OOP Principles";
		
		String s3="Welcome to learn OOP Principles";
		
		System.out.println(s2.equals(s3));//true
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		String s4="WELCOME to learn OOP Principles in java";
		
		System.out.println(s2.equals(s4));//false
		System.out.println(s2.equalsIgnoreCase(s4));//false
		
		//conversion: toUpperCase() toLowerCase()
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//trim(): Ignore white space before and after string
		String s5="    Welcome All         ";
		System.out.println(s5);
		
		System.out.println(s5.trim());
		
		//charAt(index):return character for that index position
		
		String s6="Postman is Api testing tool";
		
		
		System.out.println(s6.charAt(11));//A
		System.out.println(s6.charAt(18));//t
		
		//indexOf():this method returns first occurrence character index
		System.out.println(s6.indexOf('t'));//3
		//indexOf(char,startIndex): look for second position t
		System.out.println(s6.indexOf('t',4));//15
		//for third t
		System.out.println(s6.indexOf('t',16));//18
		
		
		//contains():for partial match of string we use contains()
		
		String s7="Selenium WebDriver is WebUI automation library";
		System.out.println("Is string contains WebUI?: "+s7.contains("WebUI"));//true
		System.out.println("Is String contains TestNG?: "+s7.contains("TestNG"));//false
		
		
		//startsWith(prefix string)  
		System.out.println("String startswith Selenium?: "+s7.startsWith("Selenium"));//true
		System.out.println("String startswith Sele?: "+s7.startsWith("Sele"));//true
		System.out.println("String startswith S?: "+s7.startsWith("S"));//true
		System.out.println("String startswith el?: "+s7.startsWith("el"));//false
		
		//endsWith(suffix string)
		System.out.println("String endswith library?: "+s7.endsWith("library"));//true
		System.out.println("String endswith ary?: "+s7.endsWith("ary"));//true
		System.out.println("String endswith y?: "+s7.endsWith("y"));//true
		System.out.println("String endswith lib?: "+s7.endsWith("lib"));//false
		
		//substring(): between string
		String s8="RestAssured is API Testing framework";
		System.out.println(s8.substring(12));
		System.out.println(s8.length());//36
		System.out.println(s8.substring(12,26));//endindex-1
		
		//replace()
		String s9="Upgradation for manual testing and automation testing with Ai is required";
		
		System.out.println(s9);
		System.out.println(s9.replace('a','*'));
		System.out.println(s9.replace("testing","*****"));
		
		//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/Pattern.html#sum
		System.out.println(s9.replaceAll("[^a]","*"));
		
		//concat()
		String s10="Hello";
		String s11="All";
		
		System.out.println(s10+" "+s11);
		System.out.println(s10.concat(" "+s11));
		
		//isEmpty():Returns true if, and only if, length() is 0.
		String s12="";
		String s13=" ";
		System.out.println(s12.isEmpty());//true
		System.out.println(s13.isEmpty());//false
		//isBlank():Returns true if the string is empty or contains only white space codepoints,otherwise false.
		System.out.println(s12.isBlank());//true
		System.out.println(s13.isBlank());//true
		
		
		//toCharArray():Converts this string to a new character array.
		String s14="Hello Everyone";
		char arr[]=s14.toCharArray();	
		for(char i:arr)
		{
			System.out.println(i);
		}
		
		
		
		//split("regular expression")
		
		String tools="Selenium,Playwright,Cypress,Appium,Postman";
		System.out.println(tools);
		String tool2=tools.split(",")[1];
		System.out.println(tool2);
		
		System.out.println("-----------------------");
		String a[]=tools.split(",");
		
		for(String i:a)
		{
			System.out.println(i);
		}
		
		
		String date="Feb 2026";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
		System.out.println(month);
		System.out.println(year);
		
		
		/*
		 * Interview Questions
		 * 
		 */
		
		//reverse the string
		String s15="Java Selenium";
		String res="";
		
		for(int i=s15.length()-1;i>=0;i--)
		{
			res=res+s15.charAt(i);
		}
		
		System.out.println("Reverse of string: "+res);
		
		//count total number of words from string
		String s16="Upgradation for manual testing and automation testing with Ai is required";
		System.out.println("Total Words are: "+s16.split(" ").length);
		
		//Scenario: for your name every even position character convert to uppercase and odd position character to lowercase
		String name="Priyanka";
		String result="";
		for(int i=0;i<name.length();i++)//index
		{
			if(i%2==0)
			{
				//even
				result=result+name.toUpperCase().charAt(i);
				
			}else
			{
				//odd
				result=result+name.toLowerCase().charAt(i);
			}
		}
		
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
