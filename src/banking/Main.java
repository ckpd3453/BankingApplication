package banking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/**Procedure
		 * ===========
		 * 1. Calling methods to calculate the interest
		 * 2. modifying interest 
		 * 3. Printing the current balance
		 */
		System.out.println("**********Banking Application*************");
		
		
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		//1. Calling methods to calculate the interest
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);

		//2. modifying interest 
		SavingsAccount.modifyInterestRate(4);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		//3. Printing the current balance
		System.out.printf("Current Balance Saver1 for interest rate 4 : " + saver1.getSavingsBalance() + "\n");
		System.out.printf("Current Balance Saver2 for interest rate 4 : " + saver2.getSavingsBalance() + "\n");
		
		//2. modifying interest 
		SavingsAccount.modifyInterestRate(5);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		//3. Printing the current balance
		System.out.printf("Current Balance Saver1 for interest rate 5 " + saver1.getSavingsBalance() + "\n");
		System.out.printf("Current Balance Saver2 for interest rate 5 " + saver2.getSavingsBalance() + "\n");
	}

}
