package com.demos.basics.day2.exceptions;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		int age=-10;
		if(age<=0)
			throw new NegativeAgeException("Age cannot be negative");
		else
			System.out.println(age);
		try
		{
			//System.exit(0);
		
		}
		/*
		 * catch(NegativeAgeException ne) { System.out.println(ne); }
		 */
		finally
		{
			System.out.println("Finally Block - Closing Resources");
		}
		
		System.out.println("End of the Main");

	}

}
