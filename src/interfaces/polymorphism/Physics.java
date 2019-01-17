package interfaces.polymorphism;
import java.util.Scanner;
public class Physics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			System.out.println("What is first time?");
			double first = input.nextDouble();
			System.out.println("What is last time?");
			double last = input.nextDouble();
			System.out.println("waves?");
			int waves = input.nextInt();
			double frequency = (last-first)/(double)waves;
			System.out.println(1/frequency);
	}

}
