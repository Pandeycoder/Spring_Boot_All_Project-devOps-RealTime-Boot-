package integer;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {
	
	
	
	public static int fact(int n)//small number
	{
		int fac=1;
		if(n==0)
			return 1;
		else
			fac=n*fact(n-1);
		return fac;
	}
	public static BigInteger fact2(int n)//small number
	{
	
	 if(n==0)
		 return BigInteger.ONE;
	 else
	 {
		 return BigInteger.valueOf(n).multiply(fact2(n-1));
	 }
	}
	
	public static BigInteger fact1(int n)//small number
	{
		BigInteger b=new BigInteger("1");
		if(n==0)
			return BigInteger.ONE;
		else
		{
		for(int i=1;i<=n;i++)
		{
			b=b.multiply(BigInteger.valueOf(i));
		}
		return b;
		}
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		//System.out.println(fact(n));
		System.out.println(fact2(n));
	
	}

}
