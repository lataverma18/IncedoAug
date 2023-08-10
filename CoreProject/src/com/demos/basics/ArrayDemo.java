package com.demos.basics;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		//int arr[]= {12,34,45,67,89};
		int arr[]= new int[]{12,34,45,67,89};
		int arr1[]= new int[n];
		
		int []arr2[]=new int[3][];
		arr2[0]=new int[2];
		arr2[1]=new int[3];
		arr2[2]=new int[5];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j< arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		
		/*
		 * for(int[] temp:arr2) { for(int temp1:temp) {
		 * 
		 * } }
		 */
		
		/*
		 * System.out.println("Enter the Values"); for(int i=0;i<n;i++)
		 * arr[i]=sc.nextInt();
		 */
		for(int temp:arr)
			System.out.println(temp);
	}
}
