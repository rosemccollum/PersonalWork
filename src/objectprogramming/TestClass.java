package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle calculator = new Circle();
	Scanner input = new Scanner(System.in);
		System.out.println("The area of the circle is " + calculator.getArea() + " inches squared");
	
}
}