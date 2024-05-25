package Colection_List;

import java.util.stream.Stream;

public class Convert_Array1 {
	
	public static void main(String[] args) {
		
		String[] test= {"hello","Pandey","leaner"};
		
		Stream<String> str=Stream.of(test);
		
		str.forEach(System.out::println);
	}

}
