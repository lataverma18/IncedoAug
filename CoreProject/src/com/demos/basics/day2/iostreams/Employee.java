package com.demos.basics.day2.iostreams;

import java.io.Serializable;

public class Employee implements Serializable//,Comparable
{
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;
		 return this.id==emp.id && this.name.equals(emp.name) && this.salary==emp.salary;
	}
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	/*
	 * @Override public int compareTo(Object o) { Employee emp=(Employee)o; return
	 * this.name.compareTo(emp.name); }
	 */}
