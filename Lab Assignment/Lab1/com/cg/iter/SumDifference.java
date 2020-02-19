package com.cg.iter;
import java.util.*;
//Exercise 2: Create a class with a method to find the difference between the sum of the squares and the square of the sum of
// the first n natural numbers. 

public class SumDifference {

	static int calculateDifference(int n) {

		int squareSum=0, sumSquare=0;
		for(int i = 1 ;i <= n ; i++){
			squareSum+=n;
		}
		for(int i = 1 ;i <= n ; i++){
			sumSquare+=(n*n);
		}
		squareSum =squareSum*squareSum;
		return (int)Math.abs(sumSquare-squareSum);

		

	}

	public static void main(String str[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println(calculateDifference(n));

	}
}