package com.demos.basics.inheritance;

interface Inf1
{
	int i=10;
	void get();
	static void put() {System.out.println("Default Def");}
}
class Inf1Impl1 implements Inf1
{

	@Override
	public void get() {
		System.err.println("get of Imf1Impl1");
	}
	@Override
	public void put() {
		System.out.println("put of Imf1Impl1");
	}
	
}

class Inf1Impl2 implements Inf1
{
	public void get() {System.out.println(" get of Inf1Impl2");}
}
public class InterfacesDemo {

	public static void main(String[] args) {
		Inf1 obj[]=new Inf1[5];
		obj[0]=new Inf1Impl1();
		obj[1]=new Inf1Impl2();
		
		for(Inf1 temp:obj)
		{
			temp.get();
		}
		System.out.println(Inf1.i);
	}
}
