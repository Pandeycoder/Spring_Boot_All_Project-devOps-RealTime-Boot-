package statement_package;
public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		bitwise();
	}
	
	private static void bitwise()
	{
		 int a=-7;  //0111 //1..........1000// 1001
		int b=11; //1011
		
		int c=a&b; //0011  //9
		System.out.println(c);
		
		int d=a|b; //1111//
		System.out.println(d);
		
		//int e=a^b; //1100
		//System.out.println(e);
		
		
	}

}
