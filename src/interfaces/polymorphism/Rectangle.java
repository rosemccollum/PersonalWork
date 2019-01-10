package interfaces.polymorphism;

public class Rectangle implements Shape {
	private int length;
	private int width;

	public Rectangle(int xLength, int xWidth) {
		length = xLength;
		width = xWidth;
	}

	public int returnLength() {
		return length;
	}

	public int returnWidth() {
		return width;
	}

	public double area() {
		double area = length * width;
		return area;
	}

	public String toString() {
		return ("Rectangle length: " + length + " width: " + width);
	}
	public double perimeter() {
		return (2*length)+(2*width);
	}
}
