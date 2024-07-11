package statement_package;

class B 
{
	int a=20;
	public void speed()
	{
		System.out.println("speed called");
	}
}

public class A extends B {
	
	int a=30;
	public void speed()
	{
		System.out.println("super  class");
	}
	public static void main(String[] args) {
		
		B ob=new A();
		ob.speed();
		System.out.println(ob.a);
		
	}
	
}
