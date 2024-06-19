package array;

import java.util.Scanner;

public class FloatDecimal_Check {
	public static void main(String[] args) {
		
		float arr[] = new float[5];
		userInput(arr);
		

	}
	public static void Count_Decimal_After_Zero(float arr[])
	{
		float arr1[]=new float[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			String s="";
			s=Float.toString(arr[i]);
			int count1=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.equals("."))
				{
					count1++;
				}
				
			}
			System.out.println(count1);
		}
	}
	
	public static void userInput(float arr[])
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number " + (i + 1) + " :- ");
			arr[i] = sc.nextFloat();
		}
	}
}
