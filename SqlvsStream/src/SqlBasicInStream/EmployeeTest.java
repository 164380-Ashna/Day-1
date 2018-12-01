package SqlBasicInStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ashna", 101, "Analyst", 10, "Development", 15700,
				101));
		emp.add(new Employee("Shubham", 101, "Developer", 20, "Development",
				35700, 102));
		emp.add(new Employee("Prince", 101, "Engineer", 30, "Testing", 45700,
				103));
		emp.add(new Employee("Sharma", 101, "Clerk", 40, "Finance", 10700, 104));
		emp.add(new Employee("Kashyap", 101, "SalesMan", 50, "Sales", 14700,
				105));
		emp.add(new Employee("Moti", 101, "Manager", 60, "Finance", 15780, 106));

		System.out.println("===========Ques 2 ==================");
		System.out.println();
		emp.stream().map(i -> i).forEachOrdered(System.out::println);
		System.out.println();

		System.out.println("===========Ques 3 ==================");
		System.out.println();
		List<Employee> empDept30 = emp.stream()
				.filter(i -> i.getDeptId() == 30).collect(Collectors.toList());
		System.out.println(empDept30);
		System.out.println();

		System.out.println("===========Ques 4 ==================");
		System.out.println();
		emp.stream()
				.filter(i -> i.getDesignation() == "Clerk")
				.map(i -> i.getEmpname() + " " + i.getEmpId() + " "
						+ i.getDeptId()).forEachOrdered(System.out::println);

		System.out.println();

		System.out.println("===========Ques 5 ==================");
		System.out.println();
		emp.stream()
				.filter(i -> i.getDeptId() > 20)
				.map(i -> i.getEmpname() + " " + i.getDeptId() + " "
						+ i.getSalary()).forEachOrdered(System.out::println);
		System.out.println();

		System.out.println("===========Ques 11 ==================");
		System.out.println();
		emp.stream()
				.filter(i -> i.getDesignation().equals("President")
						|| i.getDesignation().equals("Manager"))
				.map(i -> i.getEmpname() + " " + i.getDeptId() + " "
						+ i.getSalary()).forEachOrdered(System.out::println);
		System.out.println();

		System.out.println("===========Ques 17 ==================");
		System.out.println();
		emp.stream()
				.filter(i -> i.getSalary() > 12000 && i.getSalary() < 36000)
				.map(i -> i.getEmpname() + " " + i.getDeptId() + " "
						+ i.getSalary()).forEachOrdered(System.out::println);
		System.out.println();

		System.out.println("===========Ques 26 ==================");
		System.out.println();
		emp.stream()
				.filter(i -> i.getEmpname().charAt(0) == 'A'
						|| i.getEmpname().charAt(0) == 'P')
				.map(i -> i.getEmpname() + " " + i.getDeptId() + " "
						+ i.getSalary()).forEachOrdered(System.out::println);
		System.out.println();

	
		
		System.out.println("===========Ques 27 ==================");
		System.out.println();
		emp.stream()
				.filter(i -> i.getEmpname().charAt(i.getEmpname().length()-1) == 'm'
						|| i.getEmpname().charAt(i.getEmpname().length()-1) == 'p')
				.map(i -> i.getEmpname() + " " + i.getDeptId() + " "
						+ i.getSalary()).forEachOrdered(System.out::println);
		System.out.println();
		
		
		
		
	
	
	}

}
