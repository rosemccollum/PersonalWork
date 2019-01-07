package designingclasses;

import java.util.Scanner;
import java.util.ArrayList;

public class LearningStatics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many greeters do you want to create?");
		int create = input.nextInt();
		ArrayList<Greeter>  thing = new ArrayList<Greeter>();
		for (int i = 0; i < create; i++) {
			thing.add(new Greeter());
		}
		for (Greeter temp : thing) {
			System.out.println(temp.getAge());
		}
		ArrayList<PileOJunk> thingy = new ArrayList<PileOJunk>();
		for (int j = 0; j < 3 ; j++) {
			thingy.add(new PileOJunk());
		}
	}

}
