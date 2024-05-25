package linkedlist;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(null);
		
		Enumeration<Integer> elements=v.elements();
		
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
			
		}
	}
}
