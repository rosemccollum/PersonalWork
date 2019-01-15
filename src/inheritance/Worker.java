package inheritance;

public class Worker extends Employee {
	private int yearsExperience;

	public Worker() {
		super();
		yearsExperience = 4;
	}
	public Worker(String xName, double xRate, int xExperience) {
		super(xName, xRate);
		yearsExperience = xExperience;
	}
	public double calculatePay(double hours) {
		if (yearsExperience > 10) {
			double temp = super.calculatePay(hours) *  .2;
			return temp + super.calculatePay(hours);
		}
		return super.calculatePay(hours);
	}

	public String toString() {
		return ("Worker: " + super.toString() + " Years of Experience: " + yearsExperience);
	}
}
