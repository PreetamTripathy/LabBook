package com.cg.iter;
//lab4-Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number 

import java.util.Scanner;

public class SummingLab4 {

	public static int SummingLab4(int n) {
		int z = (n * (n + 1) / 2);

		return z * z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the value of n:");
		Scanner Scan = new Scanner(System.in);
		n = Scan.nextInt();
		System.out.println(SummingLab4(n));
	}

}
