package com.java.programs;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int x= in.nextInt();
		System.out.println("Enter 2nd number:");
		int y = in.nextInt();
		System.out.println("Sum of entered numbers is: "+(x+y));
	}

}
