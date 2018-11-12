package decisions;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 26;
		int max = 43;
		/*
		 * int heads = 0; int tails = 0; for (int counter = 0; counter < 100000;
		 * counter++) { int random = min + generator.nextInt(max - min + 1); if
		 * (random == 1) { heads = heads+1; } else { tails=tails+1; } }
		 * System.out.println("tails: " + tails); System.out.println("heads: " +
		 * heads);
		 */
		/*int multiple = 0;
		for (int counter = 0; counter < 87; counter++) {
			int random = min + generator.nextInt(max - min + 1); 
			if (random % 3 == 0) {
				multiple++;
			}
		}
		System.out.println(multiple);
		*/
		int kids = 0;
		for (int counter = 0; counter <248; counter ++) {
			int random = min + generator.nextInt(max - min + 1);
			if (random > (3*12)) {
				kids++;
			}
		}
		System.out.println(kids);
	}

}
