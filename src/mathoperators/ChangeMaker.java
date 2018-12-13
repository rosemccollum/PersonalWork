package mathoperators;
import java.util.Scanner;
public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double money = -999.99;
int quarters = -999;
int nickels = -999;
int dimes = -999;
int dollars = -999;
int pennies = -999;
double cents = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the amount you are making change for?");
money = input.nextDouble();
cents = money*100;
//dollars = cents/100;
System.out.println(dollars);
	}

}
