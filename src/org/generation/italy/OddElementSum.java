package org.generation.italy;

public class OddElementSum {
	
	public static void main(String[] args) {
		
		int[] numbers = {11, 12, 63, 24, 35, 76, 71, 28, 90};
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {

//			Considering the position of the element in the array, not the index, so the count starts at 1
			if((i + 1) % 2 != 0) {
				int num = numbers[i];
				sum += num;
				System.out.println(num);
			}
			
//			Considering the Index of the element, so the count starts at 0		
//			if(i % 2 != 0) {
//				int num = numbers[i];
//				sum += num;
//				System.out.println(num);
//			}
		}
		
		System.out.println(sum);
	}
}
