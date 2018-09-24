package mathoperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int speedlimit = -999;
int driverspeed = -999;
final int fine = 55;
final int extrafine = 40; 
int finalfine = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the speed limit?");
speedlimit = input.nextInt();
System.out.println("What speed is the driver going?");
driverspeed = input.nextInt();
finalfine = ((((driverspeed-speedlimit)-1) * extrafine ) + fine);
System.out.println("The cost of the speeding ticket is $" + finalfine);
	}

}
