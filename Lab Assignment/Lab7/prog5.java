package com.cg.iter;

//Exercise 5: Create a method which accepts an array of integer elements and
// return the second smallest element in the array 

import java.util.ArrayList;
import java.util.Collections;

public class Exercise7_5 {

	public static void main(String[] args) {
		int arr[]= {19,5,1,7,3,8,10,6};
        int output =getSecondSmallest(arr);
        
        
     
        //print the sorted values List
        System.out.println("Second Smallest Element : "+output);
    }
	private static int getSecondSmallest(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		//System.out.println(list);
		return list.get(1);
		
	}

	
    
}