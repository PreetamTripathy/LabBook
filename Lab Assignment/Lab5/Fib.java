package com.cg.iter;


//lab5 :Exercise 2: The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and 
//nonrecursive functions to print the nth value of the Fibonacci sequence? 


import java.util.Scanner;
/*Non Recursive solution*/
public class Fib {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,a=1,b=1,c=0,n;
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(" "+b);
		for (i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(" "+c);
		}
		System.out.println();
		System.out.println(n+"th value of the series is: " +c);
	}
	

}
