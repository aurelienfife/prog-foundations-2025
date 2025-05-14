package bankaccount;

public class Main {

	public static void main(String[] args) {
		
		
		Account a = new Account("Aurelien", 1000.);
		Account j = new Account("Jim", 4000.);
		
		a.deposit(100.);
		j.calculateInterest(1.02);
		j.withdraw(100.);
		
		System.out.println(a.getAccountHolder() + " " + a.getBalance());
		System.out.println(j.getAccountHolder() + " " + j.getBalance());
		
		
		
		
//
//		double aurelienAccount = 1000.;
//		double jimAccount = 4000.;
//		
//		aurelienAccount = deposit(aurelienAccount, 100.);
//		jimAccount = addInterest(jimAccount, 1.02);
//		jimAccount = withdraw(jimAccount, 100.);
//		
//		System.out.println("Aurelien: " + aurelienAccount);
//		System.out.println("Jim: " + jimAccount);
//		
//		
	}
	
//	public static double deposit(double balance, double amount) {
//		balance += amount;
//		return balance;
//	}
//	
//	public static double withdraw(double balance, double amount) {
//		balance -= amount;
//		return balance;
//	}
//	
//	public static double addInterest(double balance, double interestRate) {
//		balance *= interestRate;
//		return balance;
//	}

}
