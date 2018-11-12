package decisions;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 17;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
int realage = input.nextInt();
System.out.println(age == realage);
	}

}
