package integer;

import java.util.Scanner;

public class HcfLcm {
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else {
			return gcd(b, a % b);
		}
	}
	public static int lcmNum(int a, int b, int hcf) {
		return (a * b) / hcf;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int number1 = sc.nextInt();
		int hcf = gcd(number, number1);
		System.out.println(hcf);
		System.out.println(lcmNum(number, number1, hcf));
	}

}
