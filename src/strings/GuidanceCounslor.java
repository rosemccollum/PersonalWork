package strings;

import java.util.Scanner;

public class GuidanceCounslor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String counselor1 = " ";
		String counselor2 = " ";
		String counselor3 = " ";
		String counselor4 = " ";
		String temp = " ";
		Scanner input = new Scanner(System.in);
		System.out.println("Input the list of students' last names ONLY. Seperate each name with a space!");
		String names = input.nextLine();
		for (int i = 0; i < names.length(); i++) {
			if (names.charAt(i) == ' ') {
				temp = names.substring(0); 
				if (temp.compareTo("G") <= 0) {
					counselor1 = temp;
				}
				if (temp.compareTo("N") <= 0 && temp.compareTo("H") >= 0) {
					counselor2 = temp;
				}
				if (temp.compareTo("St") <= 0 && temp.compareTo("O") > 0) {
					counselor3 = temp;
				}
				if (temp.compareTo("Z") <= 0 && temp.compareTo("St") > 0) {
					counselor4 = temp;
				}
				names = names.substring(i+1, names.length());
			}
		}

		System.out.println("Mr Wilksons students: " + counselor1);
		System.out.println("Mrs Smiths students: " + counselor2);
		System.out.println("Mrs Johnsons students: " + counselor3);
		System.out.println("Mr Bonds students: " + counselor4);
	}
}
