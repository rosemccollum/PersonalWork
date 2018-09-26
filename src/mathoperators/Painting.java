package mathoperators;
import java.util.Scanner;
public class Painting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int TALL = 8;
final int COVERAGE = 150;
double length = -999.99;
double width = -999.99;
double area = -999.99;
double gallons = -999.99;
Scanner input = new Scanner(System.in);
System.out.println("How long is the room you are painting in feet?");
length = input.nextDouble();
System.out.println("How wide is the room you are painting in feet?");
width = input.nextDouble();
area = 2 * ((length*TALL) + (TALL*width));
gallons = area/150;
System.out.println("The wall is " + length + " feet long and " + width + " feet wide and " + TALL + " feet tall");
System.out.println("You will be painting " + area + " square feet ");
System.out.println("You will need " + gallons + " gallons of paint ");
	}

}
