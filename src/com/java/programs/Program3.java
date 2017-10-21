package com.java.programs;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		sum(x,y);
	}

	private static void sum(int x, int y) {
		System.out.println("First number is: "+x);
		System.out.println("Second number is: "+y);
		System.out.println("Sum is: "+(x+y));
	}

}
