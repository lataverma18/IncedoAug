package com.demos.basics;

public class StringDemo {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		System.out.println(str1==str2);

		String str3=new String("Hello");
		String str4=new String("hello");
		
		str1=str1.concat(" World");
		System.out.println(str1);
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		String date="12/12/2022";
		String []dateParts=date.split("/");
		System.out.println(dateParts[1]);
		
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" World!!!");
		System.out.println(sb);
		
	}

}
