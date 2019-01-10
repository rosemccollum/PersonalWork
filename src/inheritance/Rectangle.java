package inheritance;

public class Rectangle extends Quadrilateral{
	public Rectangle () {
		double r1 = getSide1();
		double r2 = getSide2();
		double r3 = getSide3();
		double r4 = getSide4();
	}
	public Rectangle (double xS1, double xS2) {
		setSide1(xS1);
		setSide2(xS2);
	}
	public double getArea() {
		return getSide1() * getSide2();
	}
}
