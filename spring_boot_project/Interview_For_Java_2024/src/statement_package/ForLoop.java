package statement_package;

public class ForLoop {
	int name = 10;
	static int name1 = 20;

	public static void main(String[] args) {

		//new ForLoop().Variable();
		Variable1();
		DataType();
	}

	private  void Variable()
	{
		int name=30;
		//System.out.println(name);
		//System.out.println(this.name);
		
	}
	private static void Variable1()
	{
		int name1=30;
		//System.out.println(name1);
		//System.out.println(ForLoop.name1);
		
	}
	private static void DataType()
	{
		byte b=127;    // -128  ----> 127      // 1 byte
		short s=32399; // -32338 ---> 32338    // 2 byte
		int i=999999999; //                    // 4 byte
		long l=999999999999999999L;// l or L   // 8 byte
		
		float f=2.393f; //                     // 4 byte
		double d=2.3444444444444444444444;     // 8 byte 
		
		System.out.println("Boolean size: " + (Byte.SIZE / 8) + " bit");
		System.out.println("Byte size :- "+Byte.SIZE+" bit");    
		System.out.println("Short size :- "+Short.SIZE+" bit");
		System.out.println("Character size :- "+Character.SIZE+" bit");
		System.out.println("Integer size :- "+Integer.SIZE+" bit");
		System.out.println("Long size :- "+Long.SIZE+" bit");
		System.out.println("Float size :- "+Float.SIZE+" bit");
		System.out.println("Double size :- "+Double.SIZE+" bit");    
		
		System.out.println(10.2/2); //
		System.out.println(10/2.4); // 10

		System.out.println(10.2/0);//10
		System.out.println(10/0); //10
		
	}


}
