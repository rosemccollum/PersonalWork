package designingclasses;
import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Employee bob = new Employee();
		bob.modifyRate(3.2);
		System.out.println("Enter a week");
		int week = input.nextInt();
		System.out.println(bob.calcPay(week));
		
	}

}
