package org.generation.italy;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero intero: ");
		int userNumber = sc.nextInt();
		
		sc.close();
		
		if(userNumber % 2 == 0) {
			System.out.println(userNumber);
		} else {
			System.out.println(userNumber + 1);
		}
	}
}
