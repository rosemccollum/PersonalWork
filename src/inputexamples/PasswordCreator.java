package inputexamples;
import java.util.Scanner;
public class PasswordCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first = -999;
int second = -999;
int third = -999;
Scanner input = new Scanner(System.in);
System.out.println("Type a single digit number");
first = input.nextInt();
System.out.println("Type another single digit number");
second = input.nextInt();
System.out.println("Type a final single digit number");
third = input.nextInt();
System.out.println("Here are your possible passwords:");
System.out.println(first + " " + second + " " + third);
System.out.println(first + " " + third + " " + second);
System.out.println(second + " " + third + " " + first);
System.out.println(second + " " + first + " " + third);
System.out.println(third + " " + first + " " + second);
System.out.println(third + " " + second + " " + first);

	}

}
