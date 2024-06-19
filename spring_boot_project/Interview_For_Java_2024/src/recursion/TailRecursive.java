package recursion;

public class TailRecursive {
	public static void main(String[] args) {
		
		printNumber(4,1);
	}
	//tail recursive
	// Quick sort is tail recursive (fatser) 
	// merge sort is not tail rec (slower)
	private static void printNumber(int n,int x)
	{
		if(n==0)
			return ;
		System.out.println(x);
		printNumber(n-1,x+1);
		
	}

}
