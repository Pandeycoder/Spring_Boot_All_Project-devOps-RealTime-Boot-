package integer;

import java.util.Scanner;

public class Sieve_Prime {

	public static void countPrimes(int n) {
		if (n < 2)
			System.out.println("0");
		boolean prime[] = new boolean[n + 1];

		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {
				for (int j = i * i; j <= n; j = i + j) {
					prime[j] = true;
				}
			}
		}

		for (int i = 2; i < n; i++) {
			if (prime[i] == false)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		countPrimes(num);
	}

}
