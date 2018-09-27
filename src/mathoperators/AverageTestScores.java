package mathoperators;
import java.util.Scanner;
public class AverageTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int testone = -999;
int testtwo = -999;
int testthree = -999;
double average = -999.99;
Scanner input = new Scanner(System.in);
System.out.println("What is the first student's test score rounded to a whole number?");
testone = input.nextInt();
System.out.println("What is the second student’s test score rounded to a whole number?");
testtwo = input.nextInt();
System.out.println("What is the third student’s test score rounded to a whole number?");
testthree = input.nextInt();
average = (testone + testtwo + testthree)/3;
System.out.println("The first test score is a " + testone + "%. \nThe second test score is a " + testtwo + "%. \nThe third test score is a " + testthree + "%");
System.out.println("The average of the test scores is a " + average + "%"); 

	}

}
