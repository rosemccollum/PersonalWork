package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employee> job = new ArrayList <Employee>();
		job.add(new Worker("Chris", 52.3, 14));
		job.add(new Manager("Tenny", 14.3, 5));
		job.add(new Worker("Jake", 24.5, 9));
		job.add(new Manager("Leah", 34.7,11));
		Random generator = new Random();
		for (Employee i : job) {
			System.out.println(i.getName() + ": $" + i.calculatePay(40));
		}
		for (Employee j : job) {
			if (j instanceof Worker) {
				System.out.println(j.toString());
			}
		}
		for (int h = job.size() - 1; h > 0; h--) {
			if (job.get(h) instanceof Manager) {
				job.remove(h);
			}
		}
		for (Employee k : job) {
			if (k.getRate() > 20) {
				System.out.println(k.getName());
			}
		}
		
	}

}
