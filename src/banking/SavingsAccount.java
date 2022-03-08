package banking;

import java.util.Scanner;

public class SavingsAccount {
	/**Procedure:-
	 * ===========
	 * 1. created a static variable using getter setter for modifying annual Interest Rate
	 * 2. Created a method to calculate the monthly interest
	 * 3. Created a method to modify interest rate
	 */

	public static double annualInterestRate;
	private double savingsBalance;

	public void setSavingsBalance(double newBalance) {
		savingsBalance = newBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//2. Created a method to calculate the monthly interest
	public double calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * (annualInterestRate / 1200));
		savingsBalance = savingsBalance + monthlyInterest;
		return monthlyInterest;
	}
	//3. Created a method to modify interest rate
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}
