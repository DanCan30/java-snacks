package org.generation.italy;

import java.util.Random;

public class RandomNameSurnameGenerator {

	public static void main(String[] args) {
		
		String[] guestsNames = {"Tizio", "Caio", "Sempronio", "Mario", "Riccardo", "Stefano", "Luigi"};
		
		String[] guestsSurnames = {"Cognome1", "Cognome2", "Cognome3", "Rossi", "Petricca", "Cappellini", "Micco"};
		
		String title = "lista invitati: ";
		
		Random rnd = new Random();
		
		System.out.println(title.toUpperCase());
		
		for(int i = 0; i < 30; i++) {
			
			int randomValue1 = rnd.nextInt(guestsNames.length);
			int randomValue2 = rnd.nextInt(guestsNames.length);
			
			System.out.println(guestsNames[randomValue1] + " " + guestsSurnames[randomValue2]);
		}
	}
}
