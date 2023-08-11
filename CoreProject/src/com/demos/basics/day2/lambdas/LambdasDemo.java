package com.demos.basics.day2.lambdas;

@FunctionalInterface
interface Inf1
{
	void get(int a);
}


public class LambdasDemo {

static void put(Inf1 i)
{
	
}
	public static void main(String[] args) {
		/*
		 * Inf1 i1=new Inf1(){
		 * 
		 * @Override public void get() { System.out.println("Hello"); }
		 * 
		 * };
		 */
		Inf1 i1=a->System.out.println("Hello"+ a);
		i1.get(10);
		
		put(a->System.out.println("Hello"+ a));
	}
}
