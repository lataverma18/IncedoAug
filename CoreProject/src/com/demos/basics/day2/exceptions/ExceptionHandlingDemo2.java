package com.demos.basics.day2.exceptions;

import java.io.IOException;

public class ExceptionHandlingDemo2 {

	static void get() throws IOException
	{
		int c=10/0;
		
	}
	public static void main(String[] args){
		System.out.println("Starting of the Main");
		
		get();
		
		System.out.println("End of the Main");

	}
}
