package com.cg.iter;

// Create a class with a method which can calculate the
//sum of first n natural numbers which are divisible by 3 or 5. 


import java.util.Scanner;

public class SumTest {
	 static int CalculateSum(int n) 
	    { 
	        int sum = 0; 
	        for (int x = 1; x <= n; x++)  {
	        	
	        if(x%3==0 || x%5==0) {
	            sum = sum + x; 
	    } 
	        
	        }
			return sum;
			
}
	public static void main(String[] args) {
		
	        int n; 
	        System.out.println("Enter the value of n:");
	        Scanner Scan = new Scanner(System.in);
	        n=Scan.nextInt();
	        System.out.println(CalculateSum(n)); 
	    }  

	}
