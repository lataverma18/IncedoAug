package com.demos.basics.inheritance;

abstract class AbClass
{
	AbClass(){}
	abstract void get();
	void put() {}
}
class AbClassImpl1 extends AbClass
{
	void get() {System.out.println(" get of AbClassImpl1");}
}

class AbClassImpl2 extends AbClass
{
	void get() {System.out.println(" get of AbClassImpl2");}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		AbClass obj[]=new AbClass[5];
		obj[0]=new AbClassImpl1();
		obj[1]=new AbClassImpl2();
		
		for(AbClass temp:obj)
		{
			temp.get();
		}
	}
}
