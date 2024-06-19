package recursion;
public class NaturalSum {

	public static void main(String[] args) {
		
		System.out.println("sum = "+sum(4));
		System.out.println("sum = "+sum1(4));
		System.out.println("sum = "+sum2(4,0));
	}
	private static int sum(int n)
	{
		return n*(n+1)/2;
	}
	
	private static int sum1(int n)
	{
		if(n==0)
			return 1;
		return n+sum(n-1);
	}
	// tail recursive call
	private static int sum2(int n ,int t)
	{ //n=4
	  if(n==0)
		  return t;  // f(3) f(2) f(1) f(0)
	 // System.out.println(t);
	  return sum2(n-1,n+t);
	  // f(3,4+0) f(2 3+4) f(1 2+7) f(0 1+9)
		
	}
}
