package recursion;
public class FabinacoSeries {
	public static void main(String[] args) {
		System.out.println(fabinaco(6));
		System.out.println(fabinaco1(6,0,1));
	}
	
	private static int fabinaco(int n)
	{
		if(n==0 || n==1)
			return n;
		return fabinaco(n-1)+fabinaco(n-2);
					
	}
	 private static int fabinaco1(int n, int a, int b) {
	        if (n ==0) 
	            return a;
	        if(n==1)
	        	return b;
	        return fabinaco1(n - 1, b, a + b); // Recursive call with updated parameters
	    }

}
