package com.cg.iter;

//Exercise 4: Create a method to check if a number is a power of two or not 

import java.io.*; 

public class CheckNumber {
	static boolean isPowerOfTwo(int n) 
    { 
        if (n == 0) 
            return false; 
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  if (isPowerOfTwo(21)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	  
	        if (isPowerOfTwo(64)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	}

}
