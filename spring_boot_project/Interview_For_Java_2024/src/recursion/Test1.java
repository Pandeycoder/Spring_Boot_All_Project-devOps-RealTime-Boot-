package recursion;
public class Test1 {
	public static void main(String[] args) {
		fun1(10);	
	}
	static void fun1(int n)
	{
		if(n==0)
			return   ;
		System.out.println("old value "+n);
		fun1(n/2);  //fun(5) f(4) f(2) f(1) f(0)
	System.out.println(n%2);
		
		
	} 

}
