package strings;

import java.util.Scanner;
import java.util.Random; 

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* int [] tests = new int [5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a test score");
			tests[i] = input.nextInt();
		}
		System.out.println("Test Scores:");
		for (int j = 0; j<5; j++) {
			System.out.println(tests[j]);
		}
		*/
		/*int[] tests = new int [5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a test score");
			tests[i] = input.nextInt(); }
			for (int j = 0; j <5; j++) {
				sum = sum + tests[j];
			}
			System.out.println(sum);
		*/
		/*int [] tests = new int [5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a test score");
			tests[i] = input.nextInt();
		}
		for (int j = 4; j >= 0; j--) {
		System.out.println(tests[j]); }
		*/
		int max = 1000;
		int min = 0;
		int [] tests = new int [250];
		int largest = 0;
		for (int i = 0; i < 250; i++) {
		int random = min + generator.nextInt(max - min + 1);
		tests[i] = random;
		 if (tests[i] >= largest) {
			 largest = tests[i];
		 }
		}
		System.out.println(largest);
	}

}
