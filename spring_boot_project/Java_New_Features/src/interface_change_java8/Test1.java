package interface_change_java8;

public interface Test1 {

	void add();
	//Non abstract 
	//Default method
	default void multiply() {
		 System.out.println("multiply from Interface..");
	}
	
	//Backward compatibility problem
	
	static void display()
	{
		System.out.println("Dipslay from interface");
	}
}
