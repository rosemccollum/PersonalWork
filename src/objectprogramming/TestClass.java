package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	House stopwatch = new House();
	Scanner input = new Scanner(System.in);
		System.out.println("How many rows in the garden?");
		int rows = input.nextInt();
		stopwatch.plantGarden(rows);
}
}