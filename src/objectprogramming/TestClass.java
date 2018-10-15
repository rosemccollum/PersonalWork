package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cat tracker = new Cat();
	Scanner input = new Scanner(System.in);
		System.out.println("Cat sleeps "+ tracker.sleepMore() + " hours on a weekday.");
		System.out.println("Cat sleeps " + tracker.sleepLess() + " hours on a weekend.");
		System.out.println("Cat is " + tracker.catBirthday() + " years old today");
		
}
}