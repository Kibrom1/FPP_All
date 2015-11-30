package week1lesson3;
//Savig account
public class SavingsAccount {

	static double annualInterestRate;
	private double savingsBalance;

	public double calculateMonthlyInterest() {

		return ((this.savingsBalance * this.annualInterestRate) / 100) / 12 + savingsBalance;
	}

	public static void modifyInterestRate(double interestRate) {

		annualInterestRate = interestRate;
	}

	public static void main(String[] args) {

		SavingsAccount.annualInterestRate = 4;
		SavingsAccount saver1 = new SavingsAccount();
		saver1.savingsBalance = 3000.00;
		SavingsAccount saver2 = new SavingsAccount();
		saver2.savingsBalance = 2000.00;
		for (int i = 1; i <= 12; i++) {
			saver1.savingsBalance = saver1.calculateMonthlyInterest();
			saver2.savingsBalance = saver2.calculateMonthlyInterest();
			System.out.println("Saving balance for saver 1 for Month " + i + " is: " + saver1.savingsBalance);
			System.out.println("Saving balance for saver 2 for Month " + i + " is: " + saver2.savingsBalance);

		}

	}
}
