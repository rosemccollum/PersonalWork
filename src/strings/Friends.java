package strings;

import java.util.Scanner;

public class Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends do you have?");
		int friends = input.nextInt();
		String[] names = new String[friends];
		System.out.println("What is your friends name?"); 
		
		for (int i = 0; i < friends; i++) {
			names[i] = input.nextLine();
		}
		int largest = 0;
		String large = " ";
		String small = " ";
		int smallest = 0;
		for (int j = 0; j < friends; j++) {
			if (names[j].length() > largest) {
				largest = names[j].length();
				large = names[j];
			}
			else {
				small = names[j];
				smallest = names[j].length();
			}
			System.out.println(names[j]);
		}
		System.out.println(large);
		System.out.println(small);
		System.out.println(largest-smallest);

	}

}
