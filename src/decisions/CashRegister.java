package decisions;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many items did you buy?");
		int items = input.nextInt();
		double h = 0;
		for (int j = 0; j < items; j++) {
			System.out.println("Cost?");
			double cost = input.nextDouble();
			h = h + cost;
		}
		System.out.println("Total: " + h);
		double tax = h * .05;
		System.out.println("Tax: " + tax);
		double total = tax + h;
		System.out.println("Grand total: " + total);

	}

}
