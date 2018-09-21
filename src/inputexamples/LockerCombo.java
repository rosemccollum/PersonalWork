package inputexamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int locker = -999;
int lockertwo = -999;
int lockerthree = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is the first number of your locker combination?");
locker = input.nextInt();
System.out.println("What is the second number of your locker combination?");
lockertwo = input.nextInt();
System.out.println("What is the third number of your locker combination?");
lockerthree = input.nextInt();
System.out.println("Your locker combination is " + locker + "-" + lockertwo + "-" + lockerthree);
	}

}
