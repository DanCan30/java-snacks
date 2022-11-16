package org.generation.italy;

public class MathOperationsOnArray {

	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int minValue = 100;
		int maxValue = 0;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int currentValue = arr[i];
			
			sum += currentValue;
			
			if ( currentValue > maxValue) {
				maxValue = currentValue;
			} else if (currentValue < minValue) {
				minValue = currentValue;
			}
		}
		
		double averageValue =  sum / (double) arr.length;
		
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);
		System.out.println("The sum of all values is: " + sum);
		System.out.println("The average value is: " + averageValue);
	}
}
