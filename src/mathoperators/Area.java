package mathoperators;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length = -999;
int area = -999;
Scanner input = new Scanner(System.in);
System.out.println("How long is the wall in feet?");
length = input.nextInt();
area = (length * 8);
System.out.println("The area of the wall is " + area + " square feet.");
	}

}
