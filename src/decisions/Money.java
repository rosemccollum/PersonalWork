package decisions;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
int age = input.nextInt();
System.out.println("What is your current GPA?");
double gpa = input.nextDouble();

if
(age+gpa > 20) {
	final int GOODPAY = 250; 
	System.out.println("You will get $" + GOODPAY);}
else
{
	final int BADPAY = 30; 
	System.out.println("You will get $" + BADPAY);
} 


	}

}
