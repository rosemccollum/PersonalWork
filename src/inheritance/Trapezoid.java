package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;
	public Trapezoid () {
		super();
		height = 0;
	}
	public Trapezoid (double xS1, double xS2, double xS3, double xS4, double xHeight) {
		super (xS1, xS2, xS3, xS4);
		height = xHeight;
	}
	public double area() {
		return ((getSide2() + getSide4())/2) * height;
	}
	public double perimeter() {
		return (getSide1() + getSide2() + getSide3() + getSide4());
	}
	

}
