package inputexamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double weight = -999.9;
int age = -999;
Scanner input = new Scanner(System.in);
System.out.println("How much do you weigh?");
weight = input.nextDouble();
System.out.println("How old are you?");
age = input.nextInt();
System.out.println("You weigh " + weight + " pounds and are " + age + " years old");

	}

}
