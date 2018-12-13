package strings;

import java.util.ArrayList;
import java.util.Random;

public class RectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 50;
		int min = 1;
		double largest = 0.0;
		double smallest = 2500.0; //largest area allowed 
		Random generator = new Random();
		ArrayList<Rectangle> yeet = new ArrayList<Rectangle>(); //declaring the array list
		int length = 0;
		int width = 0;
		int h = 0;
		int k = 0;
		for (int i = 0; i < 20; i++) {
			length = min + generator.nextInt(max - min + 1); //generating random values for each index
			width = min + generator.nextInt(max - min + 1);
			yeet.add(new Rectangle(length, width)); //adding new object with random values 
			if (yeet.get(i).returnArea() > largest) { //calling the method (returnArea) at that index (i)
				largest = yeet.get(i).returnArea();
				h = i; //holding on to the index of the largest value
			} else if (yeet.get(i).returnArea() < smallest) {
				smallest = yeet.get(i).returnArea(); 
				k = i; //holding on to the index of the smallest value
			}
		}
		yeet.add(0, yeet.get(h)); //placing the largest value at index 0 
		yeet.add(19, yeet.get(k)); //placing the smallest value at index 19
		yeet.remove(h); //removing the previous index (that was replaced above)
		yeet.remove(k);
		for (int l = 0; l < 20; l++) {
			System.out.println(yeet.get(l).returnArea());
		}
		
	}

}
