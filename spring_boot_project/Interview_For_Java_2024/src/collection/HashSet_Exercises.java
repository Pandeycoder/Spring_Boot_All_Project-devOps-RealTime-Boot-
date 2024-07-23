package collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Exercises {
	public static void main(String[] args) {
	imp_Set();	
	}
	
	static void imp_Set()
	{
		
	HashSet<String> emp=new HashSet<>();
	emp.add("Pooja");
	emp.add("Pragati");
	emp.add("Rahul");
	emp.add("Suman");
	emp.add("Suraj");
	
	System.out.println(emp);
	System.out.println(emp.size());
	
	Iterator it=emp.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	//convert hash set to ArrayList
	System.out.println("--------------");
	String array1[]=new String[emp.size()];
	emp.toArray(array1);
	for(String element:array1)
	{
		System.out.println(element);
	}
   System.out.println("-----------------");
	// cloning the object............. 
	HashSet<String> clone1=(HashSet) emp.clone();
	System.out.println(clone1);
	
	
	System.out.println("-----------------");
	//HashSet to TreeSet
	
	Set<String> tree_Set=new TreeSet<>();
	tree_Set.addAll(emp);
	//System.out.println(tree_Set);
	System.out.println("==================");
	
	//compare to hash set
	
	HashSet<String> emp1=new HashSet<>();
	emp.add("Suman");
	emp.add("Suraj");
	emp.add("Pragati");
	emp.add("Pooja");
	emp.add("Rahul");
	
	System.err.println(emp);
	System.err.println(emp1);
	System.out.println();
	//HashSet<String> res=new HashSet<String>();
	for(String element:emp)
	{
		System.out.print(emp1.contains(element)?"yes":"No");
	}
	
	
	emp.retainAll(emp1);
	System.out.println();
	System.out.println(emp);
	
	
	
	
	
	
	
//	
//	System.err.println(emp.isEmpty());
//	emp.removeAll(emp);
//	System.err.println(emp.isEmpty());
	
	}

}
