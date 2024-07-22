package collection;

import java.security.AlgorithmParametersSpi;
import java.util.ArrayList;

public class ArrayList_Inside_ArrayList {
	public static void main(String[] args) {

		copyArrayList();
	}

	static void copyArrayList() {
		ArrayList<String> emp = new ArrayList<>();

		emp.add("Rahul");
		emp.add("Pragati");
		emp.add("Pooja");
		emp.ensureCapacity(6);
		emp.add("Bijeta");

		emp.set(1, "Sardha");
		System.out.println(emp);

		ArrayList<String> id = new ArrayList<>();
		id.add("123");
		id.add("456");
		id.add("332");
		id.add("789");

		System.out.println(id);

		//One list copy into another List.
		//Collections.copy(id, emp);

		System.out.println(emp);
		System.out.println(id);
		
		
		ArrayList<String> emp_add=new ArrayList<>();
		
		//if we want to add two array list (JOIN)
		emp_add.addAll(emp);
		emp_add.addAll(id);
		
		System.out.println(emp_add);
		
		// Clone Two ArrayList....
		
		ArrayList<String> clone1=(ArrayList<String>)emp.clone();
		System.out.println(clone1);
		
		System.out.println("---------------");
		System.out.println(emp_add);
		emp_add.trimToSize();
		System.out.println(emp_add);
		System.out.println(emp_add.size());
		System.out.println("................");
		
		System.out.println(emp.isEmpty());
		//All the element remove from List
		emp.removeAll(emp);
		System.out.println(emp);
		System.out.println(emp.isEmpty());
			
	}
}
