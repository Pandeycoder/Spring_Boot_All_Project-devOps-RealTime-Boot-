package interface_change_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A implements Test1{
	
	@Override
	public void add()
	{
		Test1.super.multiply();
		System.out.println("Hii");
		
	}
	
	@Override
	public void multiply()
	{
		System.out.println(10*20);
	}
	

	static void display()
	{
		System.out.println(10*20);
	}
	public static void main(String[] args) {
		
		
		A.display(); //call static 
		
		Test1.display(); //call interface static method
		
//		A a=new A();
//		a.multiply();
		
		
		List<Integer> l=new ArrayList<>();
		l.add(20);
		l.add(30);
		
		// we can make synchronized the ArrayList
		Collections.synchronizedList(l);
		
		
		
		
			
	}
	
	

}
