package decisions;
import java.util.Scanner;
public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* int counter = 0;
for (counter = 1; counter <=10; counter=counter+1) //if you declare your variable inside the loop, it won't exist outside the loop
{
	System.out.println(counter + ". Hello");
}
*/
/* int counter = 0;
for (counter = 1; counter<=20; counter=counter+2)
{
	System.out.println(counter + ". Hello");
}
*/
/* int counter = 0;
for (counter = 15; counter<=60; counter = counter + 5)
{
	System.out.println(counter + ". Hello");
}
*/
/*	int counter = 0;
for (counter = 10; counter>=1; counter = counter - 1)
{
	System.out.println(counter + ". Hello");
}
*/
Scanner keyboard = new Scanner(System.in);
/*System.out.println("How many times would you like me to say Hello?");
int number = keyboard.nextInt();
int counter = 0;
for (counter = 1; counter <=number; counter = counter +1)
{
	System.out.println(counter + ". Hello");
}
*/
/* System.out.println("What is your favorite number?");
int favorite = keyboard.nextInt();
int counter = 0;
for (counter = 1; counter <=10; counter = counter + 1)
{
	System.out.println(favorite + ". Hello");
}
*/
/*int counter = 0;
int sum = 0;
for (counter = 1; counter <=10; counter++)
{
	sum += counter;
}
System.out.println(sum);
*/
int counter = 0;
int sum = 0;
for (counter = 1; counter <=5; counter = counter + 1)
{
	System.out.println("Give me a number");
	int num = keyboard.nextInt();
	sum += num;
}
System.out.println(sum);

	}

}
