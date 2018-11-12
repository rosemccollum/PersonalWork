package decisions;
import java.util.Scanner;
public class GradeDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your first test score?");
double first = input.nextDouble();
System.out.println("What is your second test score?");
double second = input.nextDouble();
System.out.println("What is your thrid test score?");
double third = input.nextDouble();
System.out.println("Did you do the extra credit (True/False)?");
boolean extracredit = input.nextBoolean();
if
(extracredit == true) {
	System.out.println("How many points did you get on the extra credit?"); 
	double extrapoints = input.nextDouble();
	double extragrade = ((first+second+third)/3)+ extrapoints;
		System.out.println("Your grade is " + extragrade +"%");
}
else
{
	double average = (first+second+third)/3;
			System.out.println("Your grade is " + average + "%");

}
	}

}
