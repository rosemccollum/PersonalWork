package decisions;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade = 0;
		int average = 0;
		int total = 0;
		System.out.println("How many students took the test?");
		int tests = input.nextInt();
		for (int j = 0; j < tests; j++) {
			System.out.println("What was the students' grade?");
			grade = input.nextInt();
			total = total + grade;
		}
		average = total/tests;
		System.out.println("The class average is " + average);
	}

}
