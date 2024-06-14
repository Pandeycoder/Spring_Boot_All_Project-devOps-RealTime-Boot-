package integer;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number prime or not ");
		int n = sc.nextInt();
		
		boolean b=primeNum(n);
		System.out.println(b);

		System.out.println(primeNum1(n));
	}

	public static boolean primeNum(int n) { // root n
		if (n == 0 || n == 1)
			return false;
		if ( n <=3)
			return true;
	   if (n % 2 == 0 || n % 3 == 0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}
	
	public static boolean primeNum1(int n)  // n/2
	{
		int count=0;
		if (n <=1)
			return false;
		 if (n <=3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		
		for(int i=5;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
	public static int selvePrime(int n)
	{
		return 0;
	}
	
}
