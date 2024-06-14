package Colection_List;

import java.util.Scanner;

public class Float_Decimal {
	public static void main(String[] args) {
		
		float arr[]=new float[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter a number"+(i+1)+" :- ");
			arr[i]=sc.nextFloat();
			
		}
		
		float arr1[]=new float[arr.length];
		for(int i=0;i<arr.length;i++)
		{
		float rem=0;
		while(arr[i]!=0)
		{
			rem=arr[i]%10;
			
			
			arr[i]=arr[i]/10;
		}
		System.out.println(rem);	
		}
		
	}

}
