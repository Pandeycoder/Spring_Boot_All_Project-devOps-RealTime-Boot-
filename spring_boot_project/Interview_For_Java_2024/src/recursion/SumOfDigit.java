package recursion;

public class SumOfDigit {
	public static void main(String[] args) {
		
		System.out.println(sumOfdigit(123,0));
	}
	//recursive through
	private static int sumOfdigit(int n,int sum)
	{
		if(n==0)
			return sum;
		return sumOfdigit(n/10,sum+n%10);
	}
	//Iterative Solution
	int getSumOfDigit(int n)
	{
		if(n==0)
			return  n;
		int sum=0;
		while(n!=0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
	}

}
