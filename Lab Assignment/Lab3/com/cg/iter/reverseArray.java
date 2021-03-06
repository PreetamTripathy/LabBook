package com.cg.iter;
//Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and
// returns the resulting array in sorted order 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class reverseArray
{
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		int intArr[]=new int[n]; 
		System.out.println("Enter numbers");
		for(int i=0;i<n;i++)
		{
			intArr[i]=sc.nextInt();
		}

		System.out.println("Original Array: "+Arrays.toString(intArr));
		System.out.println("Sorted Array: "+getSorted(intArray));
	}

	private static List<Integer> getSorted(int[] arr) {
		List<Integer> list = ArraysList<>();
for(int i=0;i<arr.length;i++){
list.add(arr[i]);
}
		Collections.reverse(list);
		System.out.println("Reverse Array: "+list);
		Collections.sort(list);
		return list;
	}
}