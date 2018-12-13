package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a sentence");
		String sentence = input.nextLine();
		int vowels = 0;
		for (int counter = 0; counter < sentence.length(); counter++) {
			if (sentence.charAt(counter) == 'a') {
				vowels++;
			}
			if (sentence.charAt(counter) == 'e') {
			vowels++;
			}
			if (sentence.charAt(counter) == 'i' ) {
				vowels++;
			}
			if (sentence.charAt(counter) == 'o' ) {
				vowels++;
			}
			if (sentence.charAt(counter) == 'u' ) {
				vowels++;
			}
			if (sentence.charAt(counter) == 'y' ) {
				vowels++;
			}
		}
		System.out.println(vowels);
		int constantent = (sentence.length() - vowels);
		System.out.println(constantent);
		
	}

}
