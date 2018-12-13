package strings;

import java.util.Scanner;

public class FriendAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many friends do you have?");
		int friends = input.nextInt();
		input.nextLine();
		Friend[] info = new Friend[friends];
		String name = " ";
		int age = 0;
		double total = 0.0;
		int i = 0;
		for (i = 0; i < friends; i++) {
			System.out.println("What is your friends name?");
			name = input.nextLine();
			total = total + name.length(); }
		for (i = 0; i < friends; i++) {
			System.out.println("How old is your friend?");
			age = input.nextInt();
			info[i] = new Friend(name, age);
		}
		System.out.println(total/(double)friends);
	}

}
