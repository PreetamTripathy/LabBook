package com.cg.iter;


//lab6-Exercise 1: Write a Java program that reads a line of integers and then displays each integer and
//the sum of all integers. (Use StringTokenizer class)? 

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sequence of integers with space b/w them and press enter: ");
		String digit = sc.nextLine();
		StringTokenizer token = new StringTokenizer(digit);
		int dig = 0, sum = 0;
		System.out.println("Entered digits are: ");
		while (token.hasMoreTokens()) {
			String s = token.nextToken();
			dig = Integer.parseInt(s);
			System.out.println(dig + "");
			sum = sum + dig;
		}
		System.out.println();
		System.out.println("Sum is : " + sum);
	}

}
