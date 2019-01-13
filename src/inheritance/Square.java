package inheritance;

public class Square extends Rectangle {
	public Square () {
		super();
	}
	public Square (double xS1) {
		super(xS1, xS1, xS1);
	}
	public double area() {
		return getSide1() * getSide1();
	}
	public double perimeter() {
		return getSide1() * 4;
	}

}
