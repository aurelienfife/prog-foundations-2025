package bankaccount;
public class Account {
	// Properties
	private String accountHolder;
	private double balance;
	
	// Constructor
	public Account(String holderName, double startingBalance) {
		// Initialise values at creation
		this.accountHolder = holderName;
		this.balance = startingBalance;
	}
	// Manipulation methods
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	public void calculateInterest(double rate) {
		this.balance *= rate;
	}
	
	// Getters -> readonly access to private variables
	public String getAccountHolder() {
		return this.accountHolder;
	}
	public double getBalance() {
		return this.balance;
	}
}
