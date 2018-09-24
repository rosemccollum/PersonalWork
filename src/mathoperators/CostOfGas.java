package mathoperators;
import java.util.Scanner;
public class CostOfGas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double trip = -999.99;
double mpg = -999.99;
double money = -999.99;
double totalgallons = -999.99;
double averagegas = -999.99;
Scanner input = new Scanner(System.in);
System.out.println("How far was the road trip?");
trip = input.nextDouble();
System.out.println("How many miles per gallon does your vehicle get?");
mpg = input.nextDouble();
System.out.println("How much money did you spend on gas?");
money = input.nextDouble();

System.out.println("You traveled " + trip + " miles" );
System.out.println("You spent $" + money + " on gas" );
System.out.println("You used " + trip + " gallons of gas" );
	}

}
