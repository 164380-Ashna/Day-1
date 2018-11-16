package com.cg.oops;

import java.util.Scanner;

public class Manager extends Employee {

	Scanner sc = new Scanner(System.in);

	protected double salary = 40000;
	double increment;

	public Manager(String eName, int employeeid, boolean isManager, boolean isLabour) {

		super(eName, employeeid, isManager, isLabour);
		this.isManager = true;
	}

	public double incentive(int target) {

		if (target >= 20 && target < 25) {
			increment = 10000;
			return increment;
		}

		else if (target >= 25 && target < 35) {
			increment = 15000;
			return increment;
		}

		else if (target >= 35) {
			increment = 25000;
			return increment;
		} else {
			increment = 0;
			return increment;
		}

	}

	public void SalaryCalculation() {

		System.out.println("Enter target:  ");
		int target = sc.nextInt();
		incentive(target);
		double grossIncome = salary + increment;
		System.out.println("The salary of manager is:  " + grossIncome);
	}

}
