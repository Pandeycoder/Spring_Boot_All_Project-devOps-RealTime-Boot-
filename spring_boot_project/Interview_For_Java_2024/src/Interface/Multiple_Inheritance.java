package Interface;
interface vachile
{
	void Vachile();
}
class Car implements vachile
{
	public void Vachile()
	{
		System.out.println("Hello car......");
	}
}
class Bus implements vachile
{
	public void Vachile()
	{
		System.out.println("Hello Bus......");
	}
}
public class Multiple_Inheritance {
	public static void main(String[] args) {
		
		vachile v=new Car();
	      v.Vachile();
	      v=new Bus();
	      v.Vachile();
	}

}