package com.demos.basics;
//Employee Bean Employee POJO
public class Employee {
	private int id;
	private String name;
	private int salary;
	private String department;
	
	Employee()
	{
		System.out.println("Employee is Registered Here:");
	}
	
	Employee(int id,String name,int salary,String department)
	{
		this();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	
	
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	
	  public String toString() { return id+"\t"+name+"\t"+salary+"\t"+department; }
	 
}
