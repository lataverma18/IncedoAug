package com.demos.basics;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
		Employee []arr=new Employee[5];
		arr[0]=new Employee(101,"Ronit",45000,"Prod");
		arr[1]=new Employee(102,"Raj",42000,"Prod");
		arr[2]=new Employee(103,"Rohit",43000,"Prod");
		

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getId()+"\t"+arr[i].getSalary());
		}
		/*
		 * for(Employee temp:arr) System.out.println(temp);
		 */
	}

}
