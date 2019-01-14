package inheritance;

public class Rectangle extends Parallelogram implements Geo{
	public Rectangle () {
		super();
	}
	public Rectangle (double xS1, double xS2, double height) {
		super(xS1,xS2,xS1,xS2,height);
	}
	public double getArea() {
		return getSide1() * getSide2();
	}
	public String toString() {
		return ("Rectangle: " + super.toString());
	}
}
