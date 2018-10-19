package decisions;
import java.util.Scanner;
public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your test average?");
double test = input.nextDouble();
System.out.println("What is your homework average?");
double homework = input.nextDouble();
System.out.println("Press 1 if your teacher is nice and Press 2 if your teacher is not nice.");
int teacher = input.nextInt();
if 
(teacher == 1) {
	if 
	(test>homework) {
		System.out.println("Your grade is " + test);
	}
	else
	{
		System.out.println("Your grade is " + homework);
	}
}
else
{
	if 
	(test<homework) {
		System.out.println("Your grade is " + test);
	}
	else
	{
		System.out.println("Your grade is " + homework);
	}
}
}
	}


