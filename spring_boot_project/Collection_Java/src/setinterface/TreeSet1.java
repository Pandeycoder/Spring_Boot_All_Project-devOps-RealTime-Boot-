package setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		ts.add(10);
		//ts.add("pandey");
		ts.add(20);
		ts.add(5);
		ts.add(30);
	
		System.out.println(ts);
		
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
