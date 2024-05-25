package linkedlist;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {


		//	System.out.println(2.0/1); // 
		//	System.out.println(10/0);  // ArithmeticException //n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=sum(n);
		System.out.println(ans);
		System.out.println(sum1(n));
		int sum=0;

		for(int i=1;i<n*n;i++) {
			if(i<=n) {
				sum+=i;
			}
		}
		System.out.println(sum);

		if(n==0|| n==1) {
			System.out.println("is not prime");
		}
		boolean flag =false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("prime");
		else
			System.out.println("is not prime");
		
		int prod=1;
		for(int i=1;i<n/2;i++) {
			if(i*i==n) {
				System.out.println(i);
			}
		}
		

	}
	
	//double rootFind(int n) //24 4.9
	{
		
		
	}

	static int sum(int n) { //5 //space n n
		int sum1;
		if(n==0)
		{
			return n;	
		}
		else
		{
			sum1=n+sum(n-1);
		}
		return sum1;
	}

	static int sum1(int n)
	{
		return n*(n+1)/2;
	}
}
