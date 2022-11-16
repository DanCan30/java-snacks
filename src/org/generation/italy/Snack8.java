package org.generation.italy;

import java.util.Random;

public class Snack8 {
	
	public static void main(String[] args) {
		
		Random rand = new Random(128);
		
		int[] arr = new int[10];
		int[] absoluteValuesArr = new int[arr.length];
		int multipleOf5Sum = 0; 
		
		int highestAbsoluteValue = 0;
		int lowestAbsoluteValue = 50;
		
		int highestValue = 0;
		int lowestValue = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int randomInteger = rand.nextInt(100) - 50;
			
			arr[i] = randomInteger;
			absoluteValuesArr[i] = Math.abs(randomInteger);
			
			if(absoluteValuesArr[i] > highestAbsoluteValue) {
				highestAbsoluteValue = absoluteValuesArr[i];
			};
			if(absoluteValuesArr[i] < lowestAbsoluteValue) {
				lowestAbsoluteValue = absoluteValuesArr[i];
			}
			
			if(Math.abs(arr[i]) == highestAbsoluteValue ) {
				highestValue = arr[i];
			} else if (Math.abs(arr[i]) == lowestAbsoluteValue ) {
				lowestValue = arr[i];
			}
			
			if (arr[i] % 5 == 0) {
				multipleOf5Sum = multipleOf5Sum + arr[i];
			}
		}

		System.out.println("Highest value: " + highestValue);
		System.out.println("Lowest value: " + lowestValue);
		System.out.println("The sum of the multiple of 5 elements is: " + multipleOf5Sum);
		
	}
}
