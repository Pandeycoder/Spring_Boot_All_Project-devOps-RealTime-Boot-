package statement_package;

public class Operator {

	public static void main(String[] args) {

		Operator();
		goldDisccount();
	}

	private static void Operator() {
		// Unary operator
		int a = 10;
		a--;
		a++;
		a = -10;
		a = +10;

		// BINARY OPERATOR
		int b = 10;
		int b1 = 20;

		// Int a1<<=b1;
		a = a << b; // a+=b; //a=a+b
		double f = 10;
		f = 10 - Math.pow(10, 20);

		// Ternary Operator
		int x = (10 > 20) ? 10 : 20; // false
		System.out.println(x);
		int p1 = (30 > 20) ? 30 : 20;

		int num = 5;
		int num1 = ++num; // 6
		System.out.println(num); // 6
		System.out.println(num1);// 6

	}

	private static void goldDisccount() {
		String membershipStatus = "Gold";
		double purchaseAmount = 500.0;

		// ternary operator
		double discountPercentage = (membershipStatus.equals("Gold")) ? (purchaseAmount > 1000.0 ? 15.0 : 10.0)
				: (purchaseAmount > 1000.0 ? 7.5 : 5.0);

		System.out.println("Membership Status: " + membershipStatus);
		System.out.println("Purchase Amount: $" + purchaseAmount);
		System.out.println("Discount Percentage: " + discountPercentage + "%");
	}

}
