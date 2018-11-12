package strings;

import java.util.Scanner;

public class LearningsStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("What is your age?"); int age = input.nextInt();
		 * input.nextLine(); //clears the buffer so it will read the next String
		 * System.out.println("What is your name?"); String name =
		 * input.nextLine(); System.out.println(age + "   " + name);
		 */
		/*
		 * System.out.println("Type out a sentence"); String sentence =
		 * input.nextLine(); char first = sentence.charAt(0); char third =
		 * sentence.charAt(2); System.out.println("First letter: " + first);
		 * System.out.println("Third letter: " + third);
		 * System.out.println("Whole sentence: " + sentence);
		 */
		/*
		 * System.out.println("Type a sentence"); String sentence =
		 * input.nextLine(); System.out.println("Is bob in the sentence? " +
		 * sentence.contains(" bob "));
		 */
		System.out.println("Type a word please");
		String first = input.nextLine();
		System.out.println("Type a word please");
		String second = input.nextLine();
		if (first.compareTo(second) < 0) { // negative = 1 before 2
			System.out.println(first + " comes before " + second);
		}
		if (first.compareTo(second) > 0) { // positive = 2 before 1
			System.out.println(second + " comes before " + first);
		}
		if  (first.compareTo(second) == 0 ) {
			System.out.println("Same name");
		}
	}

}
