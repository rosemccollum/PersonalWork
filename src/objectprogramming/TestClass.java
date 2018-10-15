package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	RightTriangle triangle = new RightTriangle();
	Scanner input = new Scanner(System.in);
		System.out.println("The hypotenuse of the right triangle is " + triangle.getHypot());
		System.out.println("The area of the right triangle is " + triangle.getArea());
		System.out.println("The perimeter of the right triangle is " + triangle.getPerimeter());
		
}
}