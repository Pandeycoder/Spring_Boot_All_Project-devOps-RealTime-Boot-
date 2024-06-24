package W3Resources.javabasicexercises;

public class Program2BinarySum {
	public static void main(String[] args) {
		swap(8, 7);
		int a=binaryNum(3);
		int b=binaryNum(4);
		System.out.println(a +" "+b);
		//binarySum(a,b);
		convertNum();
	}

	private static int binaryNum(int a) {
		String s = "";
		while(a!=0)
		{
			int rem=a%2;
			s=rem+s;
			a=a/2;
		}
		int x=Integer.parseInt(s);
		return x;
	}
	private static int binarySum(int a,int b) {
		
		int i=0,remainder=0;
		
		while(a!=0 || b!=0)
		{
			
		}
		return 0;
	}
	
	private static void convertNum()
	{
		int x=10;
		String binary=Integer.toBinaryString(x);
		System.out.println("Binary= "+binary);
		String hexa=Integer.toHexString(x);
		System.out.println("Hexa : "+hexa);
		String octal=Integer.toOctalString(x);
		System.out.println("octal= "+octal );
		
	}


	private static void swap(int a, int b) {
		System.out.println("Before " + a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After " + a + " " + b);
		// a=4 b=5
		a = a + b; // 9
		b = a - b;// 30-10=20
		a = a - b;
		System.out.println("After " + a + " " + b);
	}

}
