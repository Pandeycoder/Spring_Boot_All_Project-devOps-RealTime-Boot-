package integer;

import java.util.Scanner;

public class Count_Digit {

	public static int countDigit(int n) {
		int res = 0;
		while (n > 0) {
			n = n / 10;
			res++;
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		System.out.println("count of digit= " + countDigit(n));
	}

}
