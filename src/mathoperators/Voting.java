package mathoperators;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
age = input.nextInt();
System.out.println("You have " + (18 - age) + " year(s) till you can vote");
	}

}
