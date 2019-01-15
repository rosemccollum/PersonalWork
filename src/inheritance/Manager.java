package inheritance;

public class Manager extends Employee {
	private int managerLevel;

	public Manager() {
		super();
		managerLevel = 3;
	}

	public Manager(String xName, double xRate, int xLevel) {
		super(xName, xRate);
		managerLevel = xLevel;
	}

	public double calculatePay(double hours) {
		double temp = super.calculatePay(hours) * (managerLevel / 100);
		return temp + super.calculatePay(hours);
	}

	public Object clone() {
		return new Manager();
	}
}
