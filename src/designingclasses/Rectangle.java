package designingclasses;

public class Rectangle {

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

	public double returnArea() {
		double area = length * width;
		return area;
	}
	public String toString() {
		return("Rectangle length: " + length + " width: " + width);
	}
}
