package decisions;
import java.util.Scanner;
public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Are you a sales person? (true/false)");
boolean job = input.nextBoolean();
if
 (job == true ) {
	System.out.println("How many years have you been a sales person?");
	int job1length = input.nextInt();
	System.out.println("You are a sales person \nYou have worked for " + job1length + " years");
	if 
		(job1length>=3) {
		System.out.println("You are eligible for a promotion!");
	}
	else
	{
		System.out.println("You are not eligible for a promotion");
	}
}
if
 (job == false) {
	System.out.println("How many years have you been a delivery driver?");
	int job2length = input.nextInt();
	System.out.println("You are a delivery driver \nYou have worked for " + job2length + " years");
	if
		(job2length >=5) {
		System.out.println("You are eligible for a promotion!");
	}
	else
	{
		System.out.println("You are not eligible for a promotion");
	}
}

	}

}
