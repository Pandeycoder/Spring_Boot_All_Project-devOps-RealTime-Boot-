package overriding;

public class Car extends Vehicle {
	
	@Override //optional but we can use for good practice
	void start()
	{
		super.start();
		System.out.println("Car Started");
		super.start();
	}
	void shiftGears()
	{
		System.out.println("Gears shifted ");
	} 
}
