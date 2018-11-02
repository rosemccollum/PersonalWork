package decisions;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
RightTriangle one = new RightTriangle();
RightTriangle two = new RightTriangle();
boolean cont;
do { 
	System.out.println("What is the base of the first triangle?");
	int firstbase = input.nextInt();
	one.setBase(firstbase);
	System.out.println("What is the height of the first triangle?");
	int firstheight = input.nextInt();
	one.setHeight(firstheight);
	one.getArea();
	System.out.println("What is the base of the second triangle?");
	int secondbase = input.nextInt();
	two.setBase(secondbase);
	System.out.println("What is the height of the second triangle?");
	int secondheight = input.nextInt();
	two.setHeight(secondheight);
	two.getArea();
	if (one.getArea() > two.getArea()) {
		System.out.println(one.getArea());
	}
	else
	{
		System.out.println(two.getArea());
	}
	System.out.println("Would you like to continue? (true/false)");
	cont = input.nextBoolean();
	
	
} while (cont == true);
	}

}
