package com.cg.iter;

import java.util.Scanner;

public class Fibonaccci {
	int n;
	 static int fib(int n)
	 {
		 if (n==0) {
			 return 0;
		 }
		 if (n ==1 || n==2) {
			 return 1;
		 }
		 return fib(n-2) + fib(n-1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		
		System.out.println("Fibonacci series of "+n+" numbers: ");
		for(int i=1;i<n;i++) {
			System.out.println(fib(i) + "");
		}

		System.out.println();
		System.out.println(n+"th value of the series is: "+fib(n));
	}

}
