package decisions;

import java.util.Scanner;
import java.util.Random;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many sides does the die have?");
		int sides = input.nextInt();
		System.out.println("How many times would you like to roll the die?");
		int rolls = input.nextInt();
		int min = 0;
		int max = sides;
		for (int counter = 0; counter < rolls; counter++)
		{
			int randomNum = min + generator.nextInt(max - min);
			System.out.println(randomNum);
		}
			

	}

}
