package decisions;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a positive integer");
		int integer = input.nextInt();
		int h = 0;
		for (int j = 1; j < integer && j > 0; j = j + 2) {
			h = h + j;
		}
		System.out.println(h);

	}

}
