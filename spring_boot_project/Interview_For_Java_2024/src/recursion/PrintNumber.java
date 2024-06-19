package recursion;

public class PrintNumber {
	public static void main(String[] args) {
		printNumber(4);
		printNumber1(4);
	}

	private static void printNumber(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printNumber(n - 1);
	}

	private static void printNumber1(int n) {
		if (n == 0)
			return;

		printNumber1(n - 1);
		System.out.println(n);
	}
}
