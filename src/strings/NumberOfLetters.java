package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type a sentence");
		String sentence = input.nextLine();
		int vowels = 0;
		int length(); 
		for (int counter = 0; counter < int length(sentence); counter++)
		if ((sentence.contains("a") == true)) {
			vowels++;
		}
		if ((sentence.contains("e") == true)) {
			vowels++;
		}
		if ((sentence.contains("i") == true)) {
			vowels++;
		}
		if ((sentence.contains("o") == true)) {
			vowels++;
		}
		if ((sentence.contains("u") == true)) {
			vowels++;
		}
		if ((sentence.contains("y") == true)) {
			vowels++;
		}
		System.out.println(vowels);
	}

}
