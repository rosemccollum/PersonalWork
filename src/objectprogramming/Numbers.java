package objectprogramming;
import java.util.Scanner;
public class Numbers {
Scanner input = new Scanner(System.in);
public Numbers()
{
	
}
	public void sayNumber(double num) //double num = local variable declaration. void = no return
	{
		System.out.println(num);
	}
	public void sayNumber2(double num)
	{
		System.out.println(num +2);
	}
	public void saySum(double num, double num2)
	{
		System.out.println(num + num2);
	}
	public double returnSquare(double num)
	{
		double answer = num*num;
		return answer;
	}
}
