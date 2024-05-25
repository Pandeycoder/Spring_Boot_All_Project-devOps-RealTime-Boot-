package mapinterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"John",80);
		Student s2=new Student(102,"Pandey",75);
		Student s3=new Student(103,"Coder",87);
		Student s4=new Student(104,"Pragati",85);
		
		Map<Integer,Student> map=new LinkedHashMap<Integer, Student>(); 
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(4, s4);
		
		System.out.println(map);
		
		Set<Integer> keySet=map.keySet();
		for(Integer key:keySet)
		{
			System.out.println(key);
		}
		
		Set<Entry<Integer, Student>> ent=map.entrySet();
		for(Entry<Integer,Student> st:ent)
		{
			System.out.println(st.getKey()+"  "+ st.getValue());
		}
		System.out.println("================");
		 Iterator<Entry<Integer,Student>> it=ent.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
		
	}

}
