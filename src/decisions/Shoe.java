package decisions;
import java.util.Scanner;
public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your height in inches?");
int height = input.nextInt();
System.out.println("What is your shoe size?");
int shoe = input.nextInt();
System.out.println((height+shoe)>=26);
	}

}
