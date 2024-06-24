package W3Resources.javabasicexercises;

public class DigitSum5 {
	public static void main(String[] args) {
		sumOfDigit(345);
	}
	
	static void sumOfDigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digit =" +sum);
	}

}
