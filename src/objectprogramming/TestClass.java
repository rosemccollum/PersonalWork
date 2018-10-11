package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	House filler = new House();
	Scanner input = new Scanner(System.in);
		System.out.println("How tall is the pool in feet?");
		int height = input.nextInt();
		System.out.println("What is the radius of the pool in feet?");
		int radius = input.nextInt();
		filler.fillPool(height, radius);
}
}s