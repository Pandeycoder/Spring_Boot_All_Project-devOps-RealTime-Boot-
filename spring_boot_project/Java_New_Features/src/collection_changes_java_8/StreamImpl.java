package collection_changes_java_8;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

import lamda_expression.Employee;

public class StreamImpl {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Ashok", 123));
		empList.add(new Employee("Ravi", 456));
		empList.add(new Employee("Pragati", 789));
		empList.add(new Employee("pragya", 222));
		
		//write a program to print employee name whose name is starting with k
		
		for(int i=0;i<empList.size();i++)
		{
		
			if(empList.get(i).getEmpName().startsWith("k"))
			{
				System.out.println(empList.get(i).getEmpName());
			}
				
		}
	}

}
