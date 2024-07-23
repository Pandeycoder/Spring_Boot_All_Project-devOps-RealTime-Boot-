package collection_changes_java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lamda_expression.Employee;

public class ForEachExample {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();

		l.add("pandey");
		l.add("ajay");
		l.add("Rahul");
		l.add("Aditya");
		// write program to print the data in list l

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		System.out.println("Op using foreach.....");
		// Consumer s=(i)->System.out.println("consumer");

		l.forEach((s) -> System.out.println(s));

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Ashok", 123, 10000));
		empList.add(new Employee("Ravi", 456, 2000));
		empList.add(new Employee("Bijeta", 216, 20000));
		empList.add(new Employee("Soni", 456, 30000));
		empList.add(new Employee("Pragati", 789, 45672));
		empList.add(new Employee("pragya", 222, 60000));

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));

			Employee e = empList.get(i);
			if (e.getEmpName().equals("Ravi")) {
				empList.remove(i);
			}

			// toString method
			// package name.classname @hexadecimal number
		}

		System.out.println(".....................\n");
		// This is functional programming....
		empList.forEach((u) -> {
			System.out.println(u + " ");
		});

		// empList.remove(1);
//
//		empList.removeIf((p) -> {
//			if (p.getEmpName().equals("Ravi")) {
//				return true;
//			} else {
//				return false;
//			}
//		});

		empList.removeIf((p1) -> p1.getEmpName().equals("Ravi"));

		List<Integer> l2 = new ArrayList<>();
		l2.add(10);
		l2.add(0);
		l2.add(1);
		l2.add(100);
		Collections.sort(l2);
		System.out.println(l2);

		// Collections.sort(empList); //error.....


		// Write a program to sort employee list

		//generally think that sort the emp by emp id
		
		Collections.sort(empList);
		System.out.println(empList);

// Suppose sir, write a program to sort employee list- generally think that sort the employee by salary ascending	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i < empList.size(); i++) {
//			Employee e = empList.get(i);
//			if (validate(e.getEmpName())) {
//				empList.remove(e);
//			}
//		}
//		System.out.println(empList);
//		
//		empList.removeIf((p1)->{
//			if(p1.getEmpName().equals("Ravi"))
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		});
		empList.removeIf((p2) -> p2.getEmpName().equals("Ravi"));

		System.out.println(empList);
		
		
		
		
	}

	public static boolean validate(String s) {
		if (s.equals("Ravi")) {
			return true;
		} else {
			return false;
		}
	}
}
