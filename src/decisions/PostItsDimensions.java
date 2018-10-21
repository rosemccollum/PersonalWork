package decisions;
import java.util.Scanner;
public class PostItsDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
final int POSTIT = 9;
double postits;
System.out.println("Would you like to give dimensions in feet or inches? \n 1 = feet \n 2 = inches");
int dimension = input.nextInt();
System.out.println("How long is the rectangle?");
double length = input.nextDouble();
System.out.println("How wide is the rectangle?");
double width = input.nextDouble();
double area = length*width;
if 
	(dimension == 1) {
	area = area * 1441;
	postits = area/POSTIT;
	System.out.println("You will need " + postits + " Post-It notes to cover the rectangle");
} //1st if
if 
	(dimension == 2) {
		postits = area/POSTIT;
		System.out.println("You will need " + postits + " Post-It notes to cover the rectangle");
}
	}

}
