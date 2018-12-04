package strings;

import java.util.Scanner;
import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many students are in the class?");
		int students = input.nextInt();
		System.out.println("How many sides are on the die?");
		int max = input.nextInt();
		System.out.println("How many times should each student roll the die?");
		int rolls = input.nextInt();
		int min = 1;
		int [][] results = new int [students] [rolls]; 
		for (int columns = 0; columns < results[0].length; columns++) {
			for (int rows = 0; rows < results.length; rows++) {
				int random = min + generator.nextInt(max - min + 1);
				results[rows][columns] = random;
				System.out.print(results[rows][columns] + " ");
			}
			System.out.println();
		}
	}

}
