package org.generation.italy;

public class Snack7 {
 
	public static void main(String[] args) {
		
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String uniqueString = "";
		String reversedString = "";
		String longestWord = "";
		String shortestWord = "";
		
		for (int i = 0; i < words.length; i++) {
			
			String word = words[i];
			
			uniqueString += word + " ";
		}
		
		for (int i = words.length -1; i >= 0; i--) {
			
			String word = words[i];
			
			if(longestWord == "") {
				longestWord = word;
			} else if(word.length() > longestWord.length()) {
				longestWord = word;
			}
			
			if(shortestWord == "") {
				shortestWord = word;
			} else if(word.length() < shortestWord.length()) {
				shortestWord = word;
			}
			
			
			reversedString += word + " ";
		}
		
		System.out.println("Unique string: " + uniqueString);
		System.out.println("Reversed string: " + reversedString);
		

		System.out.println("---------------------");
		
		System.out.println("The longest word is: " + longestWord);
		System.out.println("The shortest word is: " + shortestWord);

	}
	
}
