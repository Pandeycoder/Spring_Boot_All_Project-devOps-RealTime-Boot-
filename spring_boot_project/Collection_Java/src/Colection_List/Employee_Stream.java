package Colection_List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Employee_Stream {
	
	public static void main(String[] args) {
		
		List<Employee1> emp=new ArrayList<>();
		
		emp.add(new Employee1("Anand","101b",8000));
		emp.add(new Employee1("pandey","102b",5000));
		emp.add(new Employee1("coder","103b",4000));
		
		
		Stream<Employee1> s=emp.stream();
		
				 s.filter(emps->emps.sal>4000)
				.map(emps->emps.name)
				.forEach(emps->System.out.println(emps));
					
	}

}
