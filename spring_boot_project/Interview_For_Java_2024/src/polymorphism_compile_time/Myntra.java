package polymorphism_compile_time;

public class Myntra { 

	void purchase(String productName)
	{
		System.out.println(productName);
	}
	void purchase(int productId)
	{
		System.out.println(productId);
	}
	void purchase(String productName,int cost,int experies)
	{
		System.out.println(cost +" "+productName);
	}
}
