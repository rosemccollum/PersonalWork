package decisions;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = -999;
		while (num != -1) {
			if (num==-1) {
				System.out.println("Error");
			}
			else {
				System.out.println("Enter an integer");
		num = input.nextInt();
			System.out.println(num*num*num);
			}
		
			
		}
	}
	

}
