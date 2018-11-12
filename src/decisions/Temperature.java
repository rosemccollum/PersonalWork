package decisions;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.println("What is the temperature?");
double temperature = input.nextDouble();
if 
(temperature <= -10) {
	System.out.println("Do nothing"); } //closed
else
{
	if
	(temperature <= 35) {
		System.out.println("Snow Shoeing");
	} //closed
	else
	{
		if 
		(temperature <= 74) {
			System.out.println("Go golfing");
		} //closed
		else
		{
			if 
			(temperature <= 83){
				System.out.println("Play tennis");
			} //closed
			else {
				System.out.println("Go swimming");
					} //closed 
				}
			}
	
		
	
} // closing first else
	} // closing main method

} // closing the class
