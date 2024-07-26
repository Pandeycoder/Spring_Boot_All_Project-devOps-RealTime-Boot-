package collection_changes_java_8;

import java.util.Comparator;

import lamda_expression.Employee;

public class EmployeeSalaryComperator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (o1.getSalary()<o2.getSalary()?-1:((o1.getSalary()==o2.getSalary()?0:-1)));
	}

	
}
