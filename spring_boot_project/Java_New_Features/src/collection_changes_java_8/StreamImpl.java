package collection_changes_java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lamda_expression.Employee;

public class StreamImpl {

	// ctr+shift+t
	// ctrl+o (all the method)
	// ctrl+shift+r (it's on classes)
	public static void main(String[] args) {

		
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(0);
		s.add(1);
		s.add(100);
		s.add(14);
		//write a program to sort the hashset
		List<Integer> l2=s.stream().collect(Collectors.toList());
		Collections.sort(l2);
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Ashok", 123,10000));
		empList.add(new Employee("Ravi", 456,2000));
		empList.add(new Employee("Pragati", 789,45672));
		empList.add(new Employee("pragya", 222,60000));

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
		 
	
		//write a program to sort employee by empId asc
			//write a program to sort employee by empId desc
			//write a program to sort employee by empId asc
			System.out.println("===============================");
			empList.stream().sorted().forEach(p->System.out.println(p));
	     
			// sort empId
			System.out.println("***************************");
			empList.stream().sorted((o1,o2)->(o1.getEmpId()<o2.getEmpId())?1: ((o1.getEmpId()==o2.getEmpId())?0:-1)).forEach(p->System.out.print(" "+p));;
	        
			
			System.out.println();
			// Intermediate - sorted,filter,map,distinct
			empList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(p->System.out.print(" "+p));;
			
			
			System.out.println("\n+++++++++++++++++++++");
			// write a program to print emp based name descending
			empList.stream().sorted((o1,o2)->(o1.getEmpName().compareTo(o2.getEmpName()))).forEach(p1->System.out.print(" "+p1));
	
			Employee[] emparray=new Employee[5];
			emparray[0]=new Employee("Ashok", 123,13000);
			emparray[1]=new Employee("sonu", 125,10700);
			emparray[2]=new Employee("monu", 129,10800);
			emparray[3]=new Employee("pooja", 1135,10020);
			emparray[4]=new Employee("pragati", 121,1040);
			
			List<Employee> el= Arrays.stream(emparray).sorted((o1,o2)->(o1.getSalary()<o2.getSalary())?-1: ((o1.getSalary()==o2.getSalary())?0:1)).collect(Collectors.toList());
			
			System.out.println("\n salary :- "+el);
			System.out.println("Min salary "+el.get(0).getSalary());
			System.out.println("Max salary "+el.get(el.size()-1).getSalary());
			
	
	}

	static boolean Validate(Employee e)// this is similar to predicate
	{
		if (e.getEmpName().startsWith("P")) {
			return true;
		}
		return false;
	}

}
