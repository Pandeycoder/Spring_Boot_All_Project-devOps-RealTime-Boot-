package review2;

public class BinaryNumber {
	public static void main(String[] args) {

		String rev = bitCal1("10011");
		System.out.println(rev);
		bitCal(rev);
	}

	private static String bitCal1(String s) {
		StringBuilder b = new StringBuilder(s);
		return b.reverse().toString();
	}
   private static void bitCal(String s)
   {
	   char ch[]=s.toCharArray();
	   int count=s.length();
	   int sum=0;
	   for(int i=0;i<s.length();i++)
	   {
		   if(ch[i]=='1')
		   {
				 int pow=1;
				 for(int j=1;j<count;j++)
				 {
					 pow=pow*2;//2*1=2 // 2*2=4 // 4*2=8 // 8*2=16
				 }
				 sum=sum+pow;
		   }
		   count--;
	   }
	   System.out.println(sum);
   }
}
