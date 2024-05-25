package collection1;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ls=new ArrayList<>();
		
		ls.add(100); //add method.......
		ls.add(200);
		ls.add(300);
		ls.add(null);
		System.out.println("list :- "+ls);
		
		ls.remove(2);  //remove method...
		System.out.println("remove after:-"+ls);
		
		ls.remove(ls);
		System.out.println("remove object :- "+ls);
		
		
		//they check data avilablr or not
		System.out.println("isEmpty :- "+ls.isEmpty());
		
		
		//ls.indexOf(ls)
		
		
		ls.clear();
		System.out.println("clear :"+ls);
		
		
		//they check data avilablr or not
	    System.out.println("isEmpty :- "+ls.isEmpty());
				
		
		
		
	}

}
