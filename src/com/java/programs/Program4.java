package com.java.programs;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int x = in.nextInt();
		System.out.println("Enter 2nd number: ");
		int y = in.nextInt();
		if(x%2==0){
			System.out.println(x+" is even");
		}else{
			System.out.println(x+" is odds");
		}
		if(y%2==0){
			System.out.println(y+" is even");
		}else{
			System.out.println(y+" is odd");
		}
	}

}
