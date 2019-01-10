package interfaces.polymorphism;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Length of Rectangle?");
		int length = input.nextInt();
		System.out.println("Width of Rectanle?");
		int width = input.nextInt();
		Shape thing = new Rectangle(length,width);
		System.out.println("Radius of circle?");
		double radii = input.nextDouble();
		Shape thing2 = new Circle(radii);
		System.out.println("Rectangle area: " + thing.area());
		System.out.println("Rectangle perimeter: " + thing.perimeter());
		System.out.println("Circle area: " + thing2.area());
		System.out.println("Circle perimeter: " + thing2.perimeter());
		
	}

}
