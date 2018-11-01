package decisions;

public class NumberOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5 && j > 0; j++) {

				System.out.print(j);
			}
			System.out.print(i);
		}

	}

}
