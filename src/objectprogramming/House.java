package objectprogramming;
import java.util.Scanner; 
public class House {
Scanner input = new Scanner(System.in);
public House()
{
	
}
	public void doPaint()
	{
		final double RATE = 1/200.0;
		final double CONVERSION = 60.0;
		System.out.println("How long is the wall in feet?");
		int length = input.nextInt();
		System.out.println("How wide is the wall in feet?");
		int width = input.nextInt();
		double time = -999.99;
		time = (length * width) * RATE * CONVERSION;
		System.out.println("It will take " + time + " minutes to paint the house");
	} 
	public void plantGarden(int rows)
	{
		final int WIDTH = 10;
		final double RATE = 15.0/2.0;
		System.out.println("How long is the garden in feet?");
		int length = input.nextInt();
		double time = (WIDTH*length)/RATE;
		System.out.println("It will take " + time + " hours to paint the house");
	}
	public void fillPool(int radius, int height)
	{
		final double RATE = 300.0;
		double time = (Math.PI * radius * radius * height)/RATE;
		System.out.println("It will take " + time + " hours to fill the pool");
	}
	
	}
