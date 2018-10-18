package decisions;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.println("How old are you?");
int age = input.nextInt();
if (age<0){
	System.out.println("You are unborn");
}
else
{
if 

	(age>=18){
		System.out.println("How tall are you?");
		double height = input.nextDouble();
		double adultnumber = height*5;
		System.out.println("Your lucky number is " + adultnumber);
	}

else
{
	System.out.println("How much do you weigh?");
	double weight = input.nextDouble();
	double kidnumber = weight/2;
	System.out.println("Your lucky number is " + kidnumber);
}
	}
}
}

