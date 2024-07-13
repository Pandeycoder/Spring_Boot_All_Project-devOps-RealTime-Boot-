package lamda_expression;

public class Example_New_Feature {
	public static void main(String[] args) {

		Test t = () -> {
			System.out.println("Hello display");
		};

		t.display(); // calling without object

		Test1 t1 = (i) -> System.out.println("hi ");
		t1.show(10);
		
		//similar
		Test2 t2=(i, j)->{
			return i+j;
		};
		 
		//Similar
		Test2 t21=(a,b)->a+b;
		
		int x=t2.add(10, 20);
		System.out.println(x);
		
		//Test3 t3=(a,b)->a*b;
		
		Test3 t3=(a,b)->{
			return a*b;
		};
		double d=t3.multi(10, 30);
		System.out.println(d);
	}

}
