package strings;

import java.util.Scanner;

public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		EssayExample bob = new EssayExample();
		System.out.println("What is your name?");
		String newname = input.nextLine();
		bob.setName(newname);
		System.out.println("Last name in capital letters: " + bob.getLastName());
		System.out.println("Number of letters in first name: " + bob.getFirstName());
		System.out.println("your name contains the letter x: " + bob.getX());
		System.out.println("Type your essay");
		String newtext = input.nextLine();
		bob.setText(newtext);
		System.out.println(bob.getTextCount());
	}

}
