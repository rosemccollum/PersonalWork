package objectprogramming;

public class BankAccount {
	private double balance;
	private double account;
	private double interestrate;

	public BankAccount() {
		balance = 0; // lame
		account = 111111; // ha what am i, kanye?
		interestrate = 1.0; // bet
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double xBalance) {
		this.balance = xBalance;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double xAccount) {
		this.account = xAccount;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double xInterestrate) {
		this.interestrate = xInterestrate;
	}
	
	

	
}
