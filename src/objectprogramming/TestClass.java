package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Worker ken = new Worker();
	Scanner input = new Scanner(System.in);
		System.out.println("Your paycheck is " + ken.payCheck() + " dollars a week");
		ken.changePay(4);
		System.out.println("Your new hourly pay is " + ken.getNewpay());
}
}