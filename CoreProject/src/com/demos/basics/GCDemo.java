package com.demos.basics;

class A
{
	void get() {}
	
	public void finalize()
	{
		System.out.println("Clean Up Operation");
	}
}
public class GCDemo {
	public static void main(String []args)
	{
		A a1=new A();
		A a2=a1;
		a1=null;
		a2=null;
		
		//System.gc();
		System.out.println("End of the Program");
	}

}
