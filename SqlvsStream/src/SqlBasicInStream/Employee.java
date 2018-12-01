package SqlBasicInStream;

public class Employee {
	
	String empname;
	int empId;
	String designation;
	int deptId;
	String department;
	double salary;
	int jobId;
	public Employee(String empname, int empId, String designation, int deptId,
			String department, double salary, int jobId) {
		super();
		this.empname = empname;
		this.empId = empId;
		this.designation = designation;
		this.deptId = deptId;
		this.department = department;
		this.salary = salary;
		this.jobId = jobId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empId=" + empId
				+ ", designation=" + designation + ", deptId=" + deptId
				+ ", department=" + department + ", salary=" + salary
				+ ", jobId=" + jobId + "]";
	}
	
	
	

}
