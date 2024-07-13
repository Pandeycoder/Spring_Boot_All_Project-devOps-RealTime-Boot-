package lamda_expression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class Advantages_Of_Lamda {

	public static void main(String[] args) {

		show(10);
		int i = 15;
		show(i);
		display("Pandey");
		String s = "Rahul";
		display(s);

		Employee a = new Employee("Pandey");
		write(a);

		validate(new Test3_Impl());

		Test3 t = (x, y) -> {
			return x * y;
		};

		Test4 t4 = () -> {
			System.out.println(20 - 10);
		};

		validate2(() -> {
			System.out.println(20 - 10);
		});

		// How to create thread

		Thread th = new Thread(new Thread1());

		Thread th1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("hii");
			}
		});

		Runnable r = () -> System.out.println("run method using lamda");

		Thread t3 = new Thread(r);

		Thread t6 = new Thread(() -> System.out.println("run method using lamda"));
		// java.util.function

		// Predicate...........
		Predicate<Employee> p = (p1) -> {
			if (p1.getEmpName().startsWith("A"))
				return true;
			return false;
		};
		boolean d=p.test(a);
		
		
		//Function................
		Function<Employee,Boolean> f1=(p2)->{
			if(p2.getEmpName().startsWith("A"))
				return true;
			return false;
		};
		
		boolean b4=f1.apply(new Employee());
		
		
		//Consumer
		Consumer<Employee> c=(e1)->System.out.println(e1.getEmpName());
		
		IntConsumer c2=(e1)->System.out.println(e1);
		
	}

	static public void show(int i) {
		System.out.println("i value is " + i);
	}

	static public void display(String i) {
		System.out.println("i value is " + i);
	}

	static public void write(Employee e) {
		System.out.println("i value is " + e);
	}

	static void validate(Test3 t) {
		t.multi(10, 40);
	}

	static void validate2(Test4 t) {
		t.sub();
	}

	public void validate1(List<Integer> l) {

	}
}
