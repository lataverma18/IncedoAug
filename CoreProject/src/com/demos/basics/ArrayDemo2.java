package com.demos.basics;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int []arr= {12,45,78,23,90,56};
		Arrays.sort(arr);
		/*
		 * for(int temp:arr) { System.out.println(temp); }
		 * System.out.println(Arrays.binarySearch(arr, 23));
		 */
			
		//int []result =Arrays.copyOf(arr, 4);
		int []result =Arrays.copyOfRange(arr, 1,3);
		for(int temp:result)
		{
			System.out.println(temp);
		}
	}
}
