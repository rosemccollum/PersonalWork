package mathoperators;
import java.util.Scanner;
public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double POSTITS = 9.000;
int length = -999;
int width = -999;
double total = -999.99;
Scanner input = new Scanner(System.in);
System.out.println("How long is the rectangle in inches?");
length = input.nextInt();
System.out.println("How wide is the rectangle in inches?");
width = input.nextInt();
total = (length * width)/POSTITS;
System.out.println("You will need " + total + " Post-Its to cover the rectangle");
	}

}
