package Colection_List.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Pandey"));
		al.add(new Student(2,"Pragati"));
		al.add(new Student(3,"pragya"));
		
		
		for(int i=al.size()-1; i>=0;i--)
	    {
	    	System.out.println(al.get(i));
	    }
		
		System.out.println("==================");
		for(Student s:al)
		{ 
			System.out.println(s);
		}
		
		System.out.println("for each lamda expression....");
		
		
		al.forEach(i ->{
			System.out.println(i);
		});
		
		
		System.out.println("===================");
		ListIterator<Student> li= al.listIterator();
	    
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
