package com.demos.basics.inheritance;

class A
{
	A(int i)
	{
		System.out.println("A class Constructor!!!");
	}
	public A get() {return null;}
}
class B extends A
{
	void put() {}
	B()
	{
		super(10);
		System.out.println("B class Constructor!!!");
	}
	B(int i)
	{
		super(i);
		System.out.println("Parameterized Constructor "+ i);
	}
	@Override
	public B get()
	{
		return null;
	}
}
public class InheritanceDemo {
	public static void main(String []args)
	{
		A a1=new B();		//Upcasting(Implicitly)
		a1.get();			//Dynamic Method Dispatching
	
		//B b1=(B)new A(10);		//Downcasting (Not Done Implicitly)
		B b1=(B)a1;				//Backward Type Casting
		
		
		a1.get();
		
	}
}
