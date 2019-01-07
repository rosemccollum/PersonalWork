package designingclasses;

import java.util.Random;

public class PileOJunk {
	private int random;
	private static int idNum = 1;
	private int myId;
	public PileOJunk() {
		Random generator = new Random();
		int max = 100;
		int min = 10;
		random  = min + generator.nextInt(max - min + 1); 
		myId = idNum;
		idNum++;
	}
	public static int getValues (int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public void setRandom(int random){
		this.random = random;
	}

}
