package com.java.programs;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = in.nextInt();
		for(int i = 1;i<=10;i++){
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}

}
