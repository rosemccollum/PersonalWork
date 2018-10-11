package objectprogramming;
import java.util.Scanner;
public class Sandbox {
public Sandbox()
{
}
Scanner input = new Scanner(System.in);
	public void fillSandbox1()
	{
		System.out.println("How long is the sandbox in feet?");
		int length = input.nextInt();
		System.out.println("How deep is the sandbox in feet?");
		int depth = input.nextInt();
		System.out.println("How wide is the sandbox in feet?");
		int width = input.nextInt();
		System.out.println("How many cubic feet of sand can your transport per hour?");
		int rate = input.nextInt();
		double time = (length*width*depth)/rate;
		System.out.println("It will take you " + time + " hours to transport that much sand");
	}
	public void fillSandbox2(int length, int depth, int width, int rate, double time)
	{
		System.out.println("It will take you " + time + " hours to transport that much sand");
	}
	public double fillSandbox3(int length, int depth, int width, int rate)
	{
		double time = (length*width*depth)/rate;
		return time;
		
	}
}
