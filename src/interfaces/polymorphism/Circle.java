package interfaces.polymorphism;

public class Circle implements Shape {
	private double radius;

	public Circle() {
		radius = 10;
	}

	public Circle(double xRadius) {
		if (xRadius > 0)
			radius = xRadius;
		else
			radius = 10;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double xRadius) {
		if (xRadius > 0)
			radius = xRadius;
		else
			radius = 10;
	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double perimeter() {
		return radius * 2 * Math.PI;
	}

	public String toString() {
		return ("This is a circle object with radius of " + radius);
	}
}
