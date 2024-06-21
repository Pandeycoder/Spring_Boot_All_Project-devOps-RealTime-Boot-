package integer;

import java.util.Scanner;

public class PowNum {
	
	public static int powNum(int x,int n)
	{ //x=3pow4 n=4  2 3  x=2 n=3
		if(n==0)
			return 1;
		
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*x; //1*2=2  //2*2=4 // 4*2=8 
		}
		return pow;
	}
	
	//Efficient solution
	public static int power(int x,int n)
	{
		if(n==0)
			return 1;
		
		int temp=power(x,n/2); // x=3 n=4// 3^2 //3^1 //3^0
		
         // 5 6 //5^3 //5^1 //5^0=125
		
		System.out.println(temp); //9
		
		temp=temp*temp; //125*125//15625
		
		if(n%2==0)
			return temp;
		else
			return temp*x;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		int pow=sc.nextInt();
	   // System.out.println(power(num,pow));
		
	    //System.out.println(power(num,pow));
	    System.out.println(powNum(num,pow));
		
	    
	}

}
