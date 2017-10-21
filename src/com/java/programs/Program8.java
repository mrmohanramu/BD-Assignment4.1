package com.java.programs;

import java.util.Arrays;
import java.util.Collections;

public class Program8 {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {
		        new Integer(15),
		        new Integer(9),
		        new Integer(16),
		        new Integer(2),
		        new Integer(30)
		    };

		    // Sorting int Array in descending order
		    Arrays.sort(intArray, Collections.reverseOrder());
		 
		    // Displaying elements of int Array
		    System.out.println("Array Elements in Descending order:");
		    for (int i = 0; i < intArray.length; i++)
		       System.out.println(intArray[i]);
	}

}
