package inheritance;

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
	}

}
