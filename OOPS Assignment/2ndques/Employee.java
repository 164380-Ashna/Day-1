package com.cg.oops;

public class Employee {

	protected boolean isManager;
	protected boolean isLabour;

	protected String eName;
	int employeeid;

	public Employee(String eName, int employeeid, boolean isManager, boolean isLabour) {
		this.eName = eName;
		this.employeeid = employeeid;
		this.isManager = isManager;
		this.isLabour = isLabour;

	}

	public static void main(String args[]) {

		Manager mg = new Manager("Ashna", 123, true, false);
		mg.SalaryCalculation();

		Labour lb = new Labour("Baby", 321, false, true);
		lb.SalaryCalculation();

	}

}
