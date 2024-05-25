package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

import Colection_List.arraylist.Student;

public class First {
	
	public static void main(String[] args) {
		
		LinkedList<Student> ll=new LinkedList<>();
		
		
		ll.add(new Student(100,"Pandey"));
		ll.add(new Student(200,"coder"));
		ll.add(new Student(300,"pragati"));
		ll.add(new Student(400,"priya"));
		
		ll.forEach( i ->{
			System.out.println(i);
		});
		
	ListIterator li=ll.listIterator();
	li.hasPrevious();
	System.out.println(li);
	
	System.out.println("========================");
	for(int i=ll.size()-1;i>=0;i--)
	{
		System.out.println(ll.get(i));
	}
	

		 
	}

}
