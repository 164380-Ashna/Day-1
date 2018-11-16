package com.cg.oops;

public class SavingAccount extends BankAccount {

	int time;
	double amount;
	double rate;

	public void withdraw(double amount) {

		super.AccountBalance -= amount;
		System.out.println("The balance is " + super.AccountBalance);

	}

	public void deposit(double amount) {
		super.AccountBalance += amount;
		System.out.println("The balance is " + super.AccountBalance);

	}

	public SavingAccount(String AccountHolderName, double AccountBalance, double AccountNo) {

		super(AccountHolderName, AccountBalance, AccountNo);

	}

	public void FixedDeposit(double amount, double time) {

		if (time >= 1 && time <= 5) {
			rate = 0.04;
			double interest = (amount * rate * time);
			double finalAmount = amount + interest;
			System.out.println("The final amount is " + finalAmount);
			System.out.println("        after a time of years:  " + time);

		} else if (time > 5 && time <= 10) {
			rate = 0.06;
			double interest = (amount * rate * time);
			double finalAmount = amount + interest;
			System.out.println("The final amount is " + finalAmount);
			System.out.println("         after a time of years:  " + time);

		}

		else if (time > 10 && time <= 15) {
			rate = 0.08;
			double interest = (amount * rate * time);
			double finalAmount = amount + interest;
			System.out.println("The final amount is " + finalAmount);
			System.out.println("         after a time of years:  " + time);

		}

		else if (time > 15) {
			rate = 0.1;
			double interest = (amount * rate * time);
			double finalAmount = amount + interest;
			System.out.println("The final amount is " + finalAmount);
			System.out.println("         after a time of years:   " + time);

		}

	}

}
