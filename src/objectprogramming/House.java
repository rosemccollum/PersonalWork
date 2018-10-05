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
	
	}
