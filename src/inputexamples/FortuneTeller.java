package inputexamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int favorite = -999;
double grade = -999.99;
int house = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your favorite number?");
favorite = input.nextInt();
System.out.println("What is your grade in this class?");
grade = input.nextDouble();
System.out.println("What is your house number?");
house = input.nextInt();
System.out.println("Your lucky number is " + house + "." );
System.out.println("You have a " + grade + " percent chance to become successful in life");
System.out.println("You will have " + favorite + " kids.");
	}

}
