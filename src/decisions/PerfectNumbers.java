package decisions;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int j;
		for (j = 0; j < 1000; j++) {
			for (int i = 1; i<j; i++) {
				if (j%i==0) {
					num = num + i;
				}
				if (num==j) {
					System.out.println(i);
				}
			}
		}
	}

}
