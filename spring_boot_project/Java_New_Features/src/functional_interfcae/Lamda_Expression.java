package functional_interfcae;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

import lamda_expression.Employee;

public class Lamda_Expression {

	public static void main(String[] args) {
		// Test t = () -> System.out.println("hii");

		// Supplier ---------2
		Supplier<Employee> s1 = () -> {
			return new Employee();
		};

		// Runnable ------3
		Runnable r = () -> System.out.print("Hii");
		r.run();

		System.out.println();

		// Function-------4
		BiFunction<Integer, Integer, Double> b = (z, y) -> {
			return 100.88;
		};

		// consumer ------5
		IntConsumer t2 = (i) -> {
			int g = 10 + 20;
			System.out.println("SUM : " + g);
		};
		t2.accept(10);

		double d = b.apply(20, 30);
		System.out.println(d);

		List l = new ArrayList();
		l.add(100);
		l.add("A");
		l.add(new Employee());
		l.add(100);

		String s = (String) l.get(0);

		// Type Casting issue
		// Type safety

	}

}
