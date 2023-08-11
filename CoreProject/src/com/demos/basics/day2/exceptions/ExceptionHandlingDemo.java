package com.demos.basics.day2.exceptions;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Starting of the Main");
		int a=200;
		int b=20;
		
		try
		{
		int c=a/b;
		System.out.println(args[c]);
		System.out.println(c);
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Denominator can't be zero");
		}
		catch(Exception aie)
		{
			System.out.println(aie);
		}
		System.out.println("End of the Main");

	}
}
