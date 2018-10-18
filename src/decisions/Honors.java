package decisions;
import java.util.Scanner;
public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double close = .001;
Scanner input = new Scanner(System.in);
System.out.println("What grade are you in?");
int grade = input.nextInt();
System.out.println("What is your GPA?");
double GPA = input.nextDouble();
if
	(grade==12&&GPA>=3.5){
		System.out.println("You graduate with honors!");
	}
else
{
			System.out.println("You do not graduate with honors.");
	
}
	}

}
