package strings;

import java.util.Scanner;
import java.util.ArrayList;

public class Algebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		int students = input.nextInt();
		input.nextLine();
		ArrayList<Student> algebra = new ArrayList<Student>();
		String name = " ";
		int score = 0;
		for (int i = 0; i < students; i++) {
			System.out.println("What is the students name?");
			name = input.nextLine();
			System.out.println("What is the students score?");
			score = input.nextInt();
			input.nextLine();
			algebra.add(new Student(name, score));
		}
		for (int i = 0; i < students; i++) {
			System.out.println(algebra.get(i).returnName());
			System.out.println(algebra.get(i).returnScore());
		}

	}

}
