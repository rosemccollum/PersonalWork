package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Sandbox filler = new Sandbox();
	Scanner input = new Scanner(System.in);
		System.out.println("How long is the sandbox in feet?");
		int length = input.nextInt();
		System.out.println("How deep is the sandbox in feet?");
		int depth = input.nextInt();
		System.out.println("How wide is the sandbox in feet?");
		int width = input.nextInt();
		System.out.println("How many cubic feet of sand can your transport per hour?");
		int rate = input.nextInt();
		filler.fillSandbox3(length, depth, width, rate);
		System.out.println("It will take " + time + " hours to fill the sandbox");
}
}