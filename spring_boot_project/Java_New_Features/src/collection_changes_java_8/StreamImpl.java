package collection_changes_java_8;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

import lamda_expression.Employee;

public class StreamImpl {

	
	// ctr+shift+t 
	// ctrl+o (all the method)
	// ctrl+shift+r (it's on classes)
	public static void main(String[] args) {

		
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Ashok", 123));
		empList.add(new Employee("Ravi", 456));
		empList.add(new Employee("Pragati", 789));
		empList.add(new Employee("Pragya", 222));
		
		//write a program to print employee name whose name is starting with k
	
		for(int i=0;i<empList.size();i++)
		{
			if(Validate(empList.get(i)))
			{
				System.out.println(empList.get(i));
			}
		}
		//In order to create Stream we should create object
		
		// 1. way is if you have collection object (List,Set,Queue) - collectionObjectName.stream
	 
		
		 // Stream is similar to for loop
		 empList.stream().filter((e1)->e1.getEmpName().startsWith("R")).forEach(e1->System.out.println(e1));
		 
	
	     
	}
	
	static boolean Validate(Employee e)// this is similar to predicate
	{
		if(e.getEmpName().startsWith("P"))
		{
			return true ;
		}
		return false;
	}

}
