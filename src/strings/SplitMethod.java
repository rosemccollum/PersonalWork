package strings;

import java.util.Scanner;
import java.util.Random;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		/*
		 * String [] words = sentence.split(" "); for (int i = 0; i <
		 * words.length; i++) { System.out.println(words[i].charAt(0)); }
		 */
		/* System.out.println("Enter a keyword");
		String keyword = input.nextLine() + " ";
		String[] words = sentence.split(keyword);
		System.out.println(words.length - 1);
		*/
		Random generator = new Random();
		String[] words = sentence.split(" ");
		int max = words.length-1;
		int min = 0;
		int random = min + generator.nextInt(max - min + 1);
		System.out.println(words[random]);
	}

}
