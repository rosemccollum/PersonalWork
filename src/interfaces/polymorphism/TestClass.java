package interfaces.polymorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList <Shape> holder = new ArrayList<Shape>();
		holder.add(new Rectangle(3,1));
		holder.add(new Circle(3));
		holder.add(new Rectangle(2,7));
		holder.add(new Circle(7));
		double area = 0;
		double perimeter = 0;
		double temp = 0;
		for (Shape i : holder) {
			area += (i.area());
			if (i.perimeter() > perimeter) {
				temp = i.perimeter();
			}
		}
		//if (i.perimeter() < temp) {
			//perimeter = i.perimeter();
		//}
		
		System.out.println(area);
		System.out.println(perimeter);
	}

}
