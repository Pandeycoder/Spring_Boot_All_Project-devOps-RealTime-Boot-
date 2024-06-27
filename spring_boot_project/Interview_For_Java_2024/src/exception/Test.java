package exception;
public class Test {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.setAge(18);
		s.setName("pandey");
		
	Employee e=new Employee("rahul",null,200);
	
	System.out.println(s.getName()+" "+s.getAge()+" "+s.getAdd());
	}

}
