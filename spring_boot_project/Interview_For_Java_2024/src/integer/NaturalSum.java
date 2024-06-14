package integer;

import java.util.Scanner;

public class NaturalSum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number if we want sum that number till");
		int n=sc.nextInt();
		System.out.println("Sum :-"+sumNatural(n));
	   
		System.out.println("Sum1 "+sumNatural1(n));
	}
	public static int sumNatural(int n)
	{
		return (n*(n+1))/2;
	}
	public static int sumNatural1(int n)
	{
		int sum=0;
		if(n==1 || n==0)
			return 1;
		else
		 sum=n+sumNatural1(n-1);
		return sum;
	}

}
