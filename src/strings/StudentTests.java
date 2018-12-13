package strings;

import java.util.Scanner;

public class StudentTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in your class?");
		int students = input.nextInt();
		System.out.println("How many tests did each student take?");
		int tests = input.nextInt();
		int [] [] averages = new int [students] [tests];
		double sum = 0.0;
		double testsum = 0.0;
		double studentsum = 0.0;
		for (int columns = 0; columns < averages[0].length; columns++) { //column by column
			for (int rows = 0; rows < averages.length; rows++) {
				System.out.println("What is the test score?");
				int score = input.nextInt();
				averages [rows][columns] = score;
				sum += averages[rows][columns];
				studentsum += averages[tests][columns];
				// System.out.print(averages [rows][columns] + " ");
				
			}	
			// System.out.println();
		}
		System.out.println("Average of all scores: " + sum/(students*tests));
		System.out.println("Average of first row: " + studentsum/tests);
		
	}

}
