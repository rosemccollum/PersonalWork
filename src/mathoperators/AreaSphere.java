package mathoperators;
import java.util.Scanner;
public class AreaSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int radius = -999;
final double FRACTION = (4.00/3.00);
Scanner input = new Scanner(System.in);
System.out.println("What is the radius of the sphere?");
radius = input.nextInt();
System.out.println("The area of the sphere is " + (radius * FRACTION * Math.PI ));
	}

}
