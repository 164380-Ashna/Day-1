package com.cg.oops;

import java.util.Scanner;

public class Labour extends Employee {

	Scanner sc = new Scanner(System.in);

	protected double salary = 20000;
	public double extraIncome;

	public Labour(String eName, int employeeid, boolean isManager, boolean isLabour) {

		super(eName, employeeid, isManager, isLabour);
		this.isLabour = true;

	}

	public double overtime(int extraWorkingHour) {

		double perDayIncome = (double) (salary / 22);
		double perHourIncome = (double) (perDayIncome / 9);
		extraIncome = (double) (extraWorkingHour * 100);
		return extraIncome;

	}

	public void SalaryCalculation() {

		System.out.println("Enter extra working hour:  ");
		int extraWorkingHour = sc.nextInt();
		overtime(extraWorkingHour);
		double grossIncome = (salary + extraIncome);
		System.out.println("The salary of labour is:  " + grossIncome);
	}

}
