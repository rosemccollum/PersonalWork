package inheritance;
import java.util.ArrayList;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle(10.0,20.0,10.0);
		System.out.println("Rect area: " + bob.getArea());
		System.out.println("Rect perimeter: " + bob.perimeter());
		Trapezoid thing = new Trapezoid(12.2,14.2,15.4,12.4,17.2);
		System.out.println("Trap area: " + thing.area());
		System.out.println("Trap perimeter: " + thing.perimeter());
		Parallelogram thingy = new Parallelogram(13.2,3.2,12.3,1.56,5.4);
		System.out.println("Para area: " + thingy.area());
		System.out.println("Para perimeter: " + thingy.perimeter());
		Square thang = new Square(4.23);
		System.out.println("Square area: " + thang.area());
		System.out.println("Square perimeter: " + thang.perimeter());
		ArrayList <Geo> shapes = new ArrayList <Geo>();
		shapes.add(new Rectangle(1.3,3.4,4.3));
		shapes.add(new Trapezoid(4.3,5.2,5.3,3.6,1.5));
		shapes.add(new Rectangle(7.2,1.34,1.53));
		shapes.add(new Trapezoid(5.2,7.3,9.2,1.4,2.3));
		shapes.add(new Rectangle(6.2,1.3,5.2));
		shapes.add(new Trapezoid(5.3,5.6,3.3,3.6,6.4));
		double largest = 0;
		for (Geo i : shapes) {
			if (i.area() > largest) {
				largest = i.area();
			}
		}
		System.out.println("Largest area: ");
		System.out.println(thingy.toString());
	}

}
