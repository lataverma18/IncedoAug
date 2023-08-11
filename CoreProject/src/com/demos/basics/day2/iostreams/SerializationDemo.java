package com.demos.basics.day2.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String []args) throws IOException, ClassNotFoundException
	{
		/*
		 * Employee emp1=new Employee(101,"Ronit",45000); FileOutputStream fout=new
		 * FileOutputStream("employees.txt"); ObjectOutputStream oos=new
		 * ObjectOutputStream(fout); oos.writeObject(emp1);
		 * System.out.println("Object is written successfully!!!");
		 */
		
		FileInputStream fin=new FileInputStream("employees.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Employee emp=(Employee)ois.readObject();
		ois.close();
		fin.close();
		System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
	}
}
