package Colection_List;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList(); //object creation default capacity 10 
		
		a1.add(100);
		a1.add(200);
		a1.add("Raju");
		a1.add(1000.50);
		
		System.out.println("Size Before : "+a1.size());
	
		a1.remove(0);
		System.out.println("Size After  : "+a1.size());
		System.out.println(a1);
	}
}
