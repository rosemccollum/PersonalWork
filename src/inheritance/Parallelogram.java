package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;
	public Parallelogram () {
		super();
		height = 0;
	}
	public Parallelogram(double xS1,double xS2, double xS3, double xS4, double xHeight) {
		super (xS1, xS2, xS3, xS4);
		height = xHeight;
	}
	public double area() {
		return (getSide2() * height);
	}
	public double perimeter() {
		return (getSide1() + getSide2() + getSide3() + getSide4());
	}
	
}
