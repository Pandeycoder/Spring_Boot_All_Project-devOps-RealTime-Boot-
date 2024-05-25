package setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetClass {
	public static void main(String[] args) {
		
		
		HashSet<String> hs=new HashSet<>(30);
		
		hs.add("Pandey");
		hs.add("coder");
		hs.add("suman");
		hs.add("Pandey");
		hs.add(null);
		
		// it is not maintain internal order..
		//hashSet class internally using hashap class 
		System.out.println(hs);
		hs.remove("coder");
		System.out.println(hs);
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		
		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(50);
		lh.add(10);
		lh.add(null);
		System.out.println(lh);
		
	
	}

}
