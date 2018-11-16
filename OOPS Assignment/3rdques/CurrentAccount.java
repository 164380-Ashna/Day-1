package com.cg.oops;

public class CurrentAccount extends BankAccount {

	double cclimit;

	public CurrentAccount(String AccountHolderName, double AccountBalance, double AccountNo) {
		super(AccountHolderName, AccountBalance, AccountNo);

	}

	public void withdraw(double amount) {

		super.AccountBalance -= amount;
		System.out.println("The balance is " + super.AccountBalance);

	}

	public void deposit(double amount) {
		super.AccountBalance += amount;
		System.out.println("The balance is " + super.AccountBalance);

	}

	public void CashCredit(double amount) {

		if (super.AccountBalance > 0 && super.AccountBalance <= 100000) {
			cclimit = 20000;
		}

		else if (super.AccountBalance > 100001 && super.AccountBalance <= 300000) {
			cclimit = 40000;
		}

		else if (super.AccountBalance > 300001 && super.AccountBalance <= 500000) {
			cclimit = 50000;
		}

		else if (super.AccountBalance > 500001 && super.AccountBalance <= 1000000) {
			cclimit = 100000;
		} else {
			System.out.println("Kindly visit the branch");
		}

		if (super.AccountBalance < amount) {
			double cutamount = amount - super.AccountBalance;
			if (cclimit - cutamount >= 0) {
				cclimit -= cutamount;
				super.AccountBalance = 0;
				System.out.println("The account balance is " + super.AccountBalance);
				System.out.println("The cash credit limit is now : " + cclimit);
			}
		} else {
			withdraw(amount);
			System.out.println("The account balance is " + super.AccountBalance);
		}
	}

}
