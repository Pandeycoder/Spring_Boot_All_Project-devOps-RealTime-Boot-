package Colection_List;

import java.util.Arrays;
import java.util.List;

public class Stream_Even {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(3,5,7,8,10,13,12);
		
		 l.stream()
		.filter(n-> n%2==0)
		.forEach(System.out::println);
		 
		 long count=l.stream()
				 .count();
		 System.out.println("count no is: - "+count);
		 

		List<String> l1=Arrays.asList("pandey","coder","java","python");
	      l1.stream()
		 .sorted()
		 .forEach(System.out::println);
		
	}

}
