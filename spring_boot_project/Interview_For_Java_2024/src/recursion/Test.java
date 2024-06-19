package recursion;

public class Test {
	public static void main(String[] args) {
    fun3(3);	
	}
	public static void fun3(int n)
	{
		if(n==0)
  			return ;
		System.out.println("Old value = "+n);
		fun3(n-1);//3 2 1
		System.out.println("New value = "+n);
	
		fun3(n-1); // 3 2 1
		
	}
	
}
