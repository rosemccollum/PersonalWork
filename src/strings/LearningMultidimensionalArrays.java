package strings;

import java.util.Random;

public class LearningMultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		/* int maxRow = 14; //just displaying the array
		int maxCol = 9;
		int maxRow2 = 3;
		int maxCol2 = 7;
		int min = 0;
		int max = 100;
		double sum = 0;
		int[][] hate = new int[maxRow2][maxCol2];
		for (int column = 0; column < hate[0].length; column++) {
			for (int row = 0; row < hate.length; row++) {
				int random = min + generator.nextInt(max - min + 1);
				hate[row][column] = random;
				sum += hate[row][column];
				//System.out.print(hate[row][column] + " ");
			}
			//System.out.println();
		}
		System.out.println(sum);
		*/
		int maxCol = 7;
		int maxRow = 3;
		int max3rd = 9;
		int min = 0;
		int max = 50;
		double sum = 0;
		int[][][] hate = new int[maxRow][maxCol][max3rd];
		for (int column = 0; column < hate[0].length; column++) {
			for (int row = 0; row < hate.length; row++) {
				for (int third = 0; third < hate[0][0].length; third++) {
					int random = min + generator.nextInt(max - min + 1);
					hate[row][column][third] = random;
					sum += hate[row][column][third];
				}
			}
		}
			System.out.println(sum);	
	}

}
