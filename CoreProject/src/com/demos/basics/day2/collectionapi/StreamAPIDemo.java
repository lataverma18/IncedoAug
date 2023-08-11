package com.demos.basics.day2.collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.management.openmbean.OpenDataException;

import com.demos.basics.day2.iostreams.Employee;

public class StreamAPIDemo {

	public static void main(String[] args) {
		int []ar= {10,56,78,9,23,45};
		IntStream stream=Arrays.stream(ar);
		
		
		ArrayList<Employee> arr=new ArrayList<>();
		arr.add(new Employee(105,"Ronit",42000));
		arr.add(new Employee(103,"Ronit",50000));  //obj2.equals(obj1)
		arr.add(new Employee(102,"Raj",42000));
		arr.add(new Employee(104,"Mohit",48000));
		arr.add(new Employee(101,"Geeta",48000));
		/*
		 * Stream<Employee> empStream=arr.stream();
		 * empStream.forEach(obj->System.out.println(obj));
		 * arr.stream().forEach(obj->System.out.println(obj));
		 */
		
		arr.stream().sorted((o1,o2)->o1.getSalary()-o2.getSalary()).forEach(obj->System.out.println(obj));
		System.out.println("------------");
		arr.stream().filter(obj->obj.getSalary()>=47000).forEach(obj->System.out.println(obj));
		System.out.println("------------");
		arr.stream().map(obj->obj.getName()+" Surname").limit(3).distinct().forEach(obj->System.out.println(obj));
		//arr.stream().limit(3).distinct().forEach(obj->System.out.println(obj.getName()+" Surname"));
		System.out.println("------------");
		arr.stream().map(obj->{obj.setName(obj.getName()+" Surname");return obj;}).limit(3).distinct().forEach(obj->System.out.println(obj));
		System.out.println("####################");
		System.out.println(arr.stream().map(obj->obj.getName()).collect(Collectors.joining(",")));
		System.out.println("---------------------");
		List<Employee> emp=arr.stream().filter(obj->obj.getSalary()>=47000).collect(Collectors.toList());
		System.out.println("------------");
		Map<Integer,Long> m=arr.stream().collect(Collectors.groupingBy(obj->obj.getSalary(),Collectors.counting()));
		System.out.println(m);
		
	Optional<Employee> op=arr.stream().filter(obj->obj.getId()==102).findAny();
	if(op.isPresent())
		System.out.println(op.get());
	else
		System.out.println("Employee not Found!!!");
	}
}
