package decisions;
import java.util.Scanner;
public class Winner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How much money did you receive for your fifth birthday?");
double money = input.nextDouble();
double equal = Math.sqrt(84.3);
double close = .001;
if 
	(Math.abs(money - equal)<close){
	System.out.println("You won a good prize!");
}
else
	System.out.println("You won a bad prize :(");
	}

}
