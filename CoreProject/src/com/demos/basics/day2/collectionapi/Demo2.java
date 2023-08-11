package com.demos.basics.day2.collectionapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.demos.basics.day2.iostreams.Employee;

public class Demo2 {
	public static void main(String []args)
	{
		TreeSet<Employee> arr=new TreeSet<>((o1,o2)->o1.getId()-o2.getId());
		arr.add(new Employee(105,"Ronit",45000));
		arr.add(new Employee(103,"Rohit",50000));  //obj2.equals(obj1)
		arr.add(new Employee(102,"Raj",42000));
		arr.add(new Employee(102,"Raj",42000));
		arr.add(new Employee(104,"Mohit",38000));
		arr.add(new Employee(101,"Geeta",48000));
		arr.add(new Employee(105,"Geeta",48000));
		
		//System.out.println(arr);
		arr.forEach(obj->System.out.println(obj));
		/*
		 * for(Employee temp:arr) System.out.println(temp);
		 */
		/*
		 * Iterator<Employee> it= arr.iterator(); while(it.hasNext())
		 * System.out.println(it.next());
		 */
		TreeSet<Employee> arr1=new TreeSet<>((o1,o2)->o1.getSalary()-o2.getSalary());
		arr1.add(new Employee(105,"Ronit",45000));
		arr1.add(new Employee(103,"Rohit",50000));  //obj2.equals(obj1)
		arr1.add(new Employee(102,"Raj",42000));
		arr1.add(new Employee(102,"Raj",42000));
		arr1.add(new Employee(104,"Mohit",38000));
		arr1.add(new Employee(101,"Geeta",48000));
		arr1.add(new Employee(105,"Geeta",48000));
		arr1.forEach(obj->System.out.println(obj));
	}
}
