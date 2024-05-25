package Colection_List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colection_List {
	
		
		public static void main(String[] args) {
			
			List<String> l=Arrays.asList("Rahul","Pandey","Rahul","coder","RAHUL");
			
			List<String> res=l.stream()
					          .distinct()
					          .collect(Collectors.toList());
			
			System.out.println("remove duplicate :- " +res);
					
			
		} 

	}


