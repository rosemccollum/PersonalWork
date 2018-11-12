package decisions;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How long is the front yard in feet?");
double length = input.nextDouble();
System.out.println("How wide is the front yard in feet?");
double width = input.nextDouble();
double area = length*width;
System.out.println("Did you cut the backyard as well? (True/False)");
boolean answer = input.nextBoolean();
if 
(answer == true) {
	System.out.println("What is the radius of the backyard in feet?");
	double radius = input.nextDouble();
	double backarea = Math.PI * radius * radius;
	double bothpay = ((area/100)+((backarea/75)*1.5));
	System.out.println("You will be paid $" + bothpay);
}
else 
{
	double pay = (area/100);
	System.out.println("You will be paid $" + pay);
}
	}

}
