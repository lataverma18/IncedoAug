package com.demos.basics;

import static java.lang.Math.*;
public class StaticDemo {
	static 
	{
		Trainee.get();
		System.out.println("Static of Demo");
	}

	public static void main(String[] args) {
		
		System.out.println("Starting of Main");
		Trainee t1=new Trainee();
		System.out.println(Trainee.technology);
		
		System.out.println(sqrt(2));
		System.out.println(pow(2, 3));
		System.out.println(random());
		System.out.println(abs(-10));

	}
}
