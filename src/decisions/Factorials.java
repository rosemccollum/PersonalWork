package decisions;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a positive integer");
		num = input.nextInt();
		int h = 1;
		for (int j = num; j > 0; j--) {
			h = h*j;
		}
		System.out.println(h);
	}

}
