package Colection_List.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class First {

	public static void main(String[] args) {
		
		//List l=new List(); beacuse interface
		
		List l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(200);
		l.add(300);
		l.add(1000);
		l.add(10);
		l.add(null);
		
		
		System.out.println(l);
		
		l.add(0,500); //not recommended lot of shifting 
		System.out.println(l);
 		
		l.add(3 ,700);
		System.out.println(l);
		
		l.set(0, 5500); //shifting is not doing...
		System.out.println(l);
		
		System.out.println(l.contains(55500));
		System.out.println(l.get(5));
		
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));
		
		l.remove(0);
		System.out.println(l);
		
		
		List l2=new ArrayList();
		l2.add(111);
		l2.add(222);
		l2.add(333);
		l2.add(200);
		
		l2.retainAll(l);
		System.out.println("l1:-" +l);
		System.out.println("l2:- " +l2);
		
		l2.addAll(l);
		
		System.out.println(l2);
		
		System.out.println(l.size());
		
		// Approach-1
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("==============");
		
		// Approach-2
		for(Object obj:l)
		{
			System.out.println(obj);
		}
		
		System.out.println("============");
		// Approach-3--------------------------
		Iterator iterator=l.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		// Approach -4 
		
		System.out.println("============");
		ListIterator listIterator=l.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		// Appraoch -5
		System.out.println("===forEach () Apporach");
		l.forEach(i -> {
			
			System.out.println(i);
		});
		
		l.clear();
		System.out.println(l);
		
		
		
	}
}

