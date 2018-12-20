package designingclasses;

import java.util.Random;
import java.util.ArrayList;

public class Employee {

	private String name = "John Smith";
	private double rate = 10.0;
	double[] hoursWorked = new double[52];
	private static int employeeClassNumber = 0;
	private int employeeNum;
	private int max = 40;
	private int min = 0;
	Random generator = new Random();

	public Employee() {
		employeeNum = employeeClassNumber;
		employeeClassNumber++;
		for (int i = 0; i < hoursWorked.length; i++) {
			int random = min + generator.nextInt(max - min + 1);
			hoursWorked[i] = random;
		}
	}

	public void modifyRate(double increase) {
		rate = rate + increase;
	}

	public double calcPay(int week) {
		return hoursWorked[week];
	}

}
