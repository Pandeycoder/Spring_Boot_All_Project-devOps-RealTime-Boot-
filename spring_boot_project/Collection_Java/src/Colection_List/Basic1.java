package Colection_List;

import java.util.ArrayList;
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Customer {
    int id;
    String name;
    double balance;

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

public class Basic1 {
  public static void main(String[] args) {
	
	 new  List1();
	  
}
  
  void List1()
  {
	  int num1=20;
	  int num2=30;
	  int num3=40; //if we have one lakh value what will i do ? That's the over come we can use array
	  
	  int arr[]=new int[3];
	  
	  arr[0]=20;
	  arr[1]=30;
	  arr[2]=40;
	  
	  /* 
	   * Array size is fixed 
	   * Array can store only homogenous data type. 
	  */
	  for(int x:arr)
	  {
		  System.out.println(x);
	  }
	  
	  
	  Object[] obj=new Object[100];
	  
	  obj[0] = new Student(101,"Raju");
	  obj[1] = new Student(102,"Rani");

	  obj[2]= new Employee(101,"Raju",100.00);
	  obj[3]= new Employee(102,"Rani",200.00);  

	  obj[4]=new  Customer(101,"Raju",100.00);
	  obj[5]= new Customer(102,"Rani",200.00);
	 
	  System.out.println(obj);
	  
	  
	  
  }
}
