package objectprogramming;
import java.util.Scanner;
public class TestClass {

public  TestClass(){
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount TwentyOneSavage = new BankAccount();
		BankAccount Migos = new BankAccount();
		
		TwentyOneSavage.setAccount(123456.0);
		TwentyOneSavage.setBalance(390987654.0);
		Migos.setAccount(123457.0);
		Migos.setBalance(12345678.0);
		
		Migos.getAccount();
		
}
}