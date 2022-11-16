package org.generation.italy;

import java.util.Random;

public class Snack4 {
	
	public static void main(String[] args) {
		
		int[] array1 = new int[10];
		int[] array2 = new int[15];
		
		int lengthDifference = 0;
		
		if (array1.length > array2.length) {
			
			lengthDifference = array1.length - array2.length;
		} else if (array1.length < array2.length) {
			
			lengthDifference = array2.length - array1.length;
		} else {
			
			System.out.println("The arrays have the same length.");
			return;
		};
		
		Random rand = new Random();
		
		for(int i = 0; i < lengthDifference; i++) {
			int randomNumber = rand.nextInt(101);
			System.out.println(randomNumber);
		}
		
	}
}
