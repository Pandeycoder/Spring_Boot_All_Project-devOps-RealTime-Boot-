package W3Resources.javabasicexercises;

public class CompareNum4 {
	public static void main(String[] args) {
		System.out.println(comapare(10, 20));

	}

	static int comapare(int a, int b) {

		if (a != b)
			return a;
		else if (b > a)
			return b;
		else
			return a;

	}
}
