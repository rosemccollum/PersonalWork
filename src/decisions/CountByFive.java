package decisions;

import java.util.Scanner;

public class CountByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the limit");
		int limit = input.nextInt();
		int counter = 0;
		while (counter < limit) {
			counter = counter + 5;
			System.out.println(counter);
		}
	}

}
