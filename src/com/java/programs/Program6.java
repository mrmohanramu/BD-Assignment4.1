package com.java.programs;

public class Program6 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = 15;
		sum(x,y);
		sum(x,y,z);
	}

	private static void sum(int x, int y, int z) {
		System.out.println("Sum of three numbers: "+(x+y+z));
	}

	private static void sum(int x, int y) {
		System.out.println("Sum of two numbers: "+(x+y));
	}

}
