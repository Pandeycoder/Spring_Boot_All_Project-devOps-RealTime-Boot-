package integer;

import java.util.HashSet;

public class HappyNumber {
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println(happy(64));
		
			
	}
	static int sumOfSquare(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem*rem;
			n=n/10;
		}
		return sum;
	}
	static boolean happy(int n)
	{
	    HashSet<Integer> st = new HashSet<>();
	    while (true) {
	    	int squ=sumOfSquare(n);
	    	if(squ==1)
	    		return true;
	    	if(st.contains(n))
	    	{
	    		return false;
	    	}
	    	st.add(squ);
	    }
	}

}
