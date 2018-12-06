package strings;

import java.util.Scanner;

public class WeddingPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many guests are coming to the wedding (multiple of 2 please)");
		int guests = input.nextInt();
		String name = " ";
		int age = 0;
		int maxRow = guests / 2;
		int maxCol = 2;
		Friend[][] seater = new Friend[maxRow][maxCol];
		input.nextLine();
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxCol; j++) {
				System.out.println("What is your guests name? ");
				name = input.nextLine();
				System.out.println("What is your guests age?");
				age = input.nextInt();
				input.nextLine();
				Friend guest = new Friend(name, age);
				seater[i][j] = guest;
			}
		}
		System.out.println("Seating chart: ");
		for (int rows = 0; rows < maxRow; rows++) {
			for (int columns = 0; columns < maxCol; columns++) {
				System.out.print(seater[rows][columns].getName() + " ");
			}
			System.out.println();
		}

	}

}
