package com.demos.basics;

class FirstDemo {
public static void main(String[] args) {
		
		Employee emp4=new Employee();
		Employee emp1=new Employee(101,"Ronit",45000,"Production");
		Employee emp2=new Employee(102,"Rohit",42000,"Production");
		Employee emp3=new Employee(103,"Raj",43000,"Production");

		System.out.println("Id\tName\tSalary\tDepartment");
		System.out.println("---------------------------------------");
		System.out.println(emp1);
		System.out.println(emp1.toString());
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		
		emp1.setSalary(50000);
		System.out.println("One Update: Salary  of "+ emp1.getName() +"is updated as:"+emp1.getSalary());
	
	}


	}
