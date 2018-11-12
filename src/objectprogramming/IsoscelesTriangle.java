package objectprogramming;

public class IsoscelesTriangle {
	private double base1;
	private double base2;
	private double height;
	private double leg;

	public IsoscelesTriangle() {
		base1 = 0;
		base2 = 0;
		height = 0;
		leg = 0;
	}

	public IsoscelesTriangle(double newBase1, double newBase2, double newHeight, double newLeg) {
		base1 = newBase1;
		base2 = newBase2;
		height = newHeight;
		leg = newLeg;
	}
	
	public double getBase1() {
		return base1;
	}
	public double getBase2() {
		return base2;
	}
	public double getHeight() {
		return height;
	}
	public double getLeg() {
		return leg;
	}
	
	public void setLeg(double xLeg) {
		xLeg = leg;
		return;
	}
	
	
	
}
