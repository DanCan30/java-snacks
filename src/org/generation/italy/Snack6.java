package org.generation.italy;

public class Snack6 {

	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] arrSumValues = new int[10];
		
		int totalSum = 0;
		
		int minValue = 100;
		int maxValue = 0;

		
		System.out.println("SummedArraysValues: ");
		
		for (int i = 0; i < arrSumValues.length; i++) {
			
			int summedValue = arr1[i] + arr2[i];
			
			if ( arr1[i] > maxValue) {
				maxValue = arr1[i];
			} else if (arr1[i] < minValue) {
				minValue = arr1[i];
			}
			
			if ( arr2[i] > maxValue) {
				maxValue = arr2[i];
			} else if (arr2[i] < minValue) {
				minValue = arr2[i];
			}
			
			arrSumValues[i] = summedValue;
			
			totalSum += summedValue;
			
			System.out.println(arrSumValues[i]);
			
		};

		double totalAverage = totalSum / (double) (arr1.length + arr2.length);
		
		System.out.println("-------------");
		
		System.out.println("The min value of the arrays is: " + minValue);
		System.out.println("The max value of the arrays is: " + maxValue);
		
		System.out.println("-------------");
		
		System.out.println("The total sum is: " + totalSum);
		System.out.println("The total average is: " + totalAverage);
	}
}
