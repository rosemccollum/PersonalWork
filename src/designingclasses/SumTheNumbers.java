package designingclasses;

public class SumTheNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumNumbers(3));
	}
	public static int sumNumbers(int num) {
		int sum = 0;
		if (num > 0) {
			sum = (num + sumNumbers(num-1));
		}
		return sum;
	}
		
}
