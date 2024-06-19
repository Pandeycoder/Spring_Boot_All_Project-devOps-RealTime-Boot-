package integer;

import java.util.Scanner;

public class TrailingZero {

	public static int fact(int n) {
		if (n == 0)
			return 1;
		else {
			return n * fact(n - 1);
		}

	}

	public static int trailing(int fact) {
		int rem = 0;
		while (fact % 10 == 0) {
			rem++;
			fact = fact / 10;
		}
		return rem;
	}
	
	public static int trailing1(int fact) {
		int rem = 0;
		int i=5;
		while (i<=fact) {
			
			rem=rem+fact/i;
			i=i*5;
		}
		return rem;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		int fact1 = fact(number);
		System.out.println(fact1);
		System.out.println(trailing(fact1));
		System.out.println(trailing1(number));
	}

}
