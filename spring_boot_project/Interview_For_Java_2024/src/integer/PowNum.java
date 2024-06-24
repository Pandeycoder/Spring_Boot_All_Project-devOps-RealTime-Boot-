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
	public static int power(int num,int pow)
	{
		if(pow==0)
			return 1;
		int temp=power(num,pow/2); // x=3 n=4// 3^2 //3^1 //3^0
	
		//System.out.println(temp); //9
		
		temp=temp*temp; //125*125//15625
		
		if(pow%2==0)
			return temp;
		else
			return temp*num;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		int pow=sc.nextInt();
	   // System.out.println(power(num,pow));
		
	    //System.out.println(power(num,pow));
	    System.out.println(power(num,pow));
		
	    System.out.println(printNos(10));
	    
	}
	public static int printNos(int N)
    {
        if(N==0)
        	return 1;
        return printNos(N-1);
    }
    
}
