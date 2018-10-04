package objectprogramming;
import java.util.Scanner; 
public class House {
Scanner input = new Scanner(System.in);
public House()
{
	
}
	public void askLength()
	{
		System.out.println("How long is the wall in feet?");
		int length = input.nextInt();
	}
	public void askWidth()
	{
		System.out.println("How wide is the wall in feet?");
		int width = input.nextInt();
	}
	public void sayArea()
	{
		int area = length*width
	}
	
}
