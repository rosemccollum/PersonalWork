package decisions;
import java.util.Scanner;
public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int counter2 = 0;
		int multiply = 0;
		/*
		 * for (counter=1; counter <= 4; counter = counter + 1) { for
		 * (multiply=1; multiply <=5; multiply++) {
		 * System.out.print(counter*multiply + "   "); } System.out.println(); }
		 */
		/*
		 * for (counter = 1; counter <= 4; counter = counter + 1) {
		 * 
		 * for (counter2 = 1; counter2 <=5; counter2 = counter2 +1){
		 * 
		 * if (counter == 3) { System.out.print(counter);
		 * 
		 * } else {
		 * 
		 * System.out.print(counter2); } } }
		 */
		/* int divisors = 0;
		int divisors2 = 0;
		int largest = 0;
		for (counter = 1; counter <= 1000; counter = counter + 1) {
			divisors = 0;
			for (counter2 = 1; counter2 <= counter; counter2 = counter2 + 1) {
				if (counter % counter2 == 0)
				{
					divisors++;
					if (divisors > divisors2)
					{
						divisors2 = divisors;
								largest = counter;
					}
				}
			}

		}
		System.out.println(largest);
		*/
	
	 /*	Scanner new = input Scanner (System.in);
		int total = 0;
	int largest = 0;
		for (counter = 0; counter <3; counter++) {
		for (counter2 = 0; counter2<2; counter2++) {
			System.out.println("Blue eyes? (true/false");
			boolean blue = input.nextBoolean();
			if (blue == true) {
				int cat=cat+1;
				total++;
				if (cat > largest) {
					largest = cat;
				}
			}
		}
		System.out.println(total);
		System.out.println(largest);
	}
	*/
	}

}
