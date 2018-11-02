package decisions;

public class RightTriangle {

	private double base;
	private double height;

	public RightTriangle() {
		base = 0;
		height = 0;
	}

	public RightTriangle(double newBase, double newHeight) {
		base = newBase;
		height = newHeight;
	}
	public void setBase (double newBase) {
		base = newBase;
	}
	public void setHeight (double newHeight) {
		height = newHeight;
	}
	public double getArea() {
		double area = .5*base*height;
		return area;
	}
	

}
