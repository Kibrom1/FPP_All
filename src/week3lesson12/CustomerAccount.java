package week3lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerAccount {
	private String customerName;
	private int accountNunber;
	private double balance;

	// private double withdraw;
	CustomerAccount(String name, int accountNo, double balance) {
		customerName = name;
		accountNunber = accountNo;
		this.balance = balance;
	}

	public double deposit(double deposit) {
		return this.balance + deposit;
	}

	public double withdraw(double withDraw) {
		return this.balance - withDraw;
	}

	public static void main(String[] args) {
		CustomerAccount customer1 = new CustomerAccount("Jhon", 100000, 1000.0);
		Scanner input = new Scanner(System.in);
		// double withdraw = input.nextDouble();
		System.out.println("Ener w to withdraw or d to depoist: ");
		try {
			String chx = input.next();
			if (chx.equals("w")) {
				System.out.print("Enter amount to withdraw: ");
				double draw = input.nextDouble();
				if (customer1.balance > 100 && draw < customer1.balance) {

					System.out.println(" Balance after withdrawal: " + customer1.withdraw(draw));
				} else
					throw new NumberFormatException();
			} else if (chx.equals("d")) {
				System.out.print("Enter amount to withdraw: ");
				double depo = input.nextDouble();
				if (depo > 0) {
					System.out.print("The new balance is: " + customer1.deposit(depo));
				} else
					throw new NumberFormatException();
			} else
				System.out.print("Enter w or d ");
		} catch (NumberFormatException e1) { // Range check
			System.out.println("Either ur balance is below 100 or ur withdrawal is greater than balance"
					+ "\nif u r with drawing or u trying to improper deposit input ");

		} catch (InputMismatchException e2) { // Something other than a number
			System.out.println("withdraw and deposit values should be numbers.");
		}

	}
}
