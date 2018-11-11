package decisions;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 0;
		int k = 0;
		int t = 0;
		int p = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = input.nextInt(); // 20
		for (int i = 2; i < num && i > 0; i++) {
			if (num % i == 0) {
				h = i; // 2
				System.out.println(h);
				t = num / i; // 10
				for (int j = 2; j < t; j++) {
					if (t % j == 0) {
						k = j;
						p = t / j;
						System.out.println(p);
						System.out.println(k);
					}
				}
			}
		}
	}

}
