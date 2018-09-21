package mathoperators;

import java.util.Scanner;

public class AgeAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
int agetwo = -999;
int agethree = -999;
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
age = input.nextInt();
System.out.println("How old is your best boy friend?");
agetwo = input.nextInt();
System.out.println("How old is your best girl friend?");
agethree = input.nextInt();
System.out.println("You and your friends combined age is " + (age + agetwo + agethree) + " years old.");
	}

}
