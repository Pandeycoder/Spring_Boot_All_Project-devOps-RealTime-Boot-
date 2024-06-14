package integer;

import java.util.Scanner;

public class Palindrome {

	public static boolean palindromeNum(int n) {
		int rem = 0;
		int rev = 0;
		int original = n;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (original == rev) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		System.out.println(palindromeNum(n));
	}

}
