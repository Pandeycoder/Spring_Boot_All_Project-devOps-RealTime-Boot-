package mapinterface;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	
	public static void main(String[] args) {
		Map<Integer,String> mp=new LinkedHashMap<>();
		
		
		Map map=new HashMap();
		map.put(1,"Rahul");
		map.put(2, "Pragati");
		map.put(3, "Rupesh");
		map.put(1, "coder");
		System.out.println(map);
		
		for(int i=0;i<map.size();i++)
		{
			System.out.println(map.get(i));
		}
		
		Set<Integer> keySet=map.keySet();
		for(Integer key:keySet)
		{
			System.out.print(" "+key+"  ");
			System.out.println(map.get(key));
		}
		
		Collection<String> ls=map.values();
		for(String s:ls)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------");
		Set<Entry<Integer,String>> en= map.entrySet();	
//		
		Iterator<Entry<Integer,String>>  ite=en.iterator();
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
		for(Entry<Integer,String> ent:en)
		{
			System.out.println(ent.getKey()+" = "+ent.getValue());
		}
		
		System.out.println("--------------");
		
		System.out.println(map.containsKey(1));
		System.out.println(map.replace(2, "Pooja"));
		
		System.out.println(map.get(2));
		
		map.clear();
		System.out.println(map);
		
	}

}
