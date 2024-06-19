package string;

import java.util.Scanner;

public class StringAddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :-");
		String name=sc.next();
		findNumber(name);
		
	}
	
	public static void findNumber(String s)
	{
		int arr[]=new int[s.length()];
		
		String sum="";
		
		char s1[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			
		   for(int j=0;j<=9;j++)
		   {
			   if(s1[i]==j)
			   {
				   
			   }
		   }
		}
		
		
	}

}
