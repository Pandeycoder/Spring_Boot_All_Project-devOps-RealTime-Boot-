package integer;

import java.util.Scanner;

public class AllDivisor_Number {

	public static void divisor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
	}

	public static void divisor1(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				if (i != n / i) {
					System.out.println(n / i);

				}

			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		divisor1(n);

	}

}
