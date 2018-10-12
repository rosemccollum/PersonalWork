package letsTeachYouStuff;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Class1 kek = new Class1();
		Class1 skeet = new Class1(8,0);
		
		System.out.println("I have made two class1's. Kek and Skeet. We will run through what values have what and when");
		System.out.println("Inside of Kek, the value of the dabs and yeets is " + kek.getDabs() +" dabs, and " +  kek.getYeets() + " yeets. This was done in the defult constructor");
		System.out.println("");
		System.out.println("Inside of Skeet, the value of the dabs and yeets is " + skeet.getDabs() +" dabs, and " +  skeet.getYeets() + " yeets. This was done in the alternate constructor");
		
		kek.setDabs(50);
		kek.setYeets(70);
		
		System.out.println("If we look in the code above this statement, I just changed the value of dabs and yeets. However, we don't know what the value"
				+  "of those were until we ask for them, so we use the accessor methods. Dabs is: " + kek.getDabs() + " and yeets is: " + kek.getYeets());
	}
}
