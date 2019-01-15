package inheritance;

public class Employee {

	private String name = " ";
	private double rate = 0.00;
	public Employee () {
		name = "Mia";
		rate = 8.75;
	}
	public Employee (String xName, double xRate) {
		name = xName;
		rate = xRate;
	}
	public double calculatePay(double hours) {
		return hours * rate;
	}
	public double getRate() {
		return rate;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return ("Employee- name: " + name + " Rate: " + rate);
	}
	public boolean equals(Object anObject) {
		return (this.toString().equals(anObject.toString()));
	}
	
}
