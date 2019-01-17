package interfaces.polymorphism;

import java.util.ArrayList;

public class LearningPolymorphisms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle one = new Circle(5);
		Circle two = new Circle(3);
		Rectangle r2 = new Rectangle(5,8);
		Rectangle r1 = new Rectangle(3,7);
		ArrayList<Shape> counter = new ArrayList<Shape>();
		counter.add(r1);
		counter.add(one);
		counter.add(r2);
		counter.add(two);
		double area = 0;
		for(Shape bob : counter) {
			//area += counter.getArea(); getArea doesn't work
			
		}
		
		
	}

}
