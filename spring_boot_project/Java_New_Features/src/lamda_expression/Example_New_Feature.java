package lamda_expression;

public class Example_New_Feature {
	public static void main(String[] args) {
		
		Test t= () ->{
			System.out.println("Hello display");
		};
		
		t.display(); //calling without object
		
		
		Test1 t1=(i) -> {
			int j=i*10;
			System.out.println("hi "+j);
		};
		t1.show(10);
	}
	

}
