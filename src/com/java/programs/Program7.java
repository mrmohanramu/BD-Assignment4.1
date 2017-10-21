package com.java.programs;
/* In java, method overloading is not possible by changing the return type of the method only 
 * because of ambiguity.*/
public class Program7 {

	static int add(int a, int b) {
		return a + b;
	}

	static double add(int a, int b) {
		return a + b;
	}
}

class TestOverloading3 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));// Here, how can java determine which sum() method should be called?
	}
}