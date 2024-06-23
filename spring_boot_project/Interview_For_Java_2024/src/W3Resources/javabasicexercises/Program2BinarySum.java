package W3Resources.javabasicexercises;

public class Program2BinarySum {
	public static void main(String[] args) {
		swap(8, 7);
		binarySum(10, 20);
	}

	private static void binarySum(int a, int b) {
		String x = Integer.toBinaryString(a);
		String x1 = Integer.toBinaryString(b);
		System.out.println(x + x1);
	}

	private static void swap(int a, int b) {
		System.out.println("Before " + a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After " + a + " " + b);
		// a=4 b=5
		a = a + b; // 9
		b = a - b;// 30-10=20
		a = a - b;
		System.out.println("After " + a + " " + b);
	}

}
