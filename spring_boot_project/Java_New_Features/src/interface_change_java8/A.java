package interface_change_java8;

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
	public static void main(String[] args) {
		
		
//		A a=new A();
//		a.multiply();
			
	}
	
	

}
