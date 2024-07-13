package interface_change_java8;

public interface Test1 {

	void add();
	//Non abstract 
	//Default method
	default void multiply() {
		 System.out.println("multiply from Interface..");
	}
	
	//Backward compatibility problem
}
