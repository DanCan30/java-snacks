package org.generation.italy;

import java.util.Random;

public class RandomNameSurnameGenerator {

	public static void main(String[] args) {
		
		String[] guestsNames = {"Tizio", "Caio", "Sempronio", "Mario", "Riccardo", "Stefano", "Luigi"};
		
		String[] guestsSurnames = {"Cognome1", "Cognome2", "Cognome3", "Rossi", "Petricca", "Cappellini", "Micco"};
		
		System.out.println("LISTA INVITATI: ");
		
		Random rnd = new Random();
		
		for(int i = 0; i < 30; i++) {
			
			int randomValue1 = rnd.nextInt(guestsNames.length);
			int randomValue2 = rnd.nextInt(guestsSurnames.length);
			
			System.out.println(guestsNames[randomValue1] + " " + guestsSurnames[randomValue2]);
		}
	}
}
