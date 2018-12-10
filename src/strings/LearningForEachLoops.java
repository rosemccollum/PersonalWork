package strings;

import java.util.Scanner;
import java.util.ArrayList;

public class LearningForEachLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*System.out.println("How many students are in the class?");
		int students = input.nextInt();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		int age = 0;
		for (int i = 0; i < students; i++) {
			//System.out.println("How old is this student?");
			age = input.nextInt();
			ages.add(new Integer(age));
			
		}
		double sum = 0.0;
		for (int x : ages) {
			sum = sum + x;
		}
		double average = sum/(double)students;
			//System.out.println(average);
			 * */
		/*ArrayList<Double> wages = new ArrayList<Double>();
		System.out.println("How many employees are at the company?");
		int employees = input.nextInt();
		double wage = 0;
		double largest = 0;
		for (int i = 0; i < employees; i++) {
			System.out.println("What is this employees wages?");
			wage = input.nextDouble();
			wages.add(new Double(wage));
		}
		
		for (double worker : wages){
			if (worker > largest) {
				largest = worker;
			}
		}
		System.out.println(largest);
		*/
		ArrayList<Circle> thing = new ArrayList<Circle>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Radii?");
			double radius = input.nextDouble();
			thing.add(new Circle(radius));
		}
		for (Circle counter : thing) {
			System.out.println(counter.area());
		}
	}

}
