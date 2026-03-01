package com.CoreJava.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExpection {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{

		System.out.println("Program started.......");
		
		Thread.sleep(4000);
		
		System.out.println("Program ends.......");
		
		File f1=new File(System.getProperty("user.dir")+"//Config.properties");
		FileInputStream fs=new FileInputStream(f1);
		
		
		
	}

}
