package integer;

import java.util.Scanner;

public class Series_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sequence(num);
	}
	
	private static void sequence(int n)
	{
		int series=8;
		int res=1;
		int i=2;
		System.out.print(1+"");
		while(i<n)
		{
			for(int j=0;j<2;j++)
			{
				res=res+series;
				System.out.print(" "+res);
				i++;
				
			}
			series=series+8;
		}
	}

}
