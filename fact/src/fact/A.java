package fact;

import java.math.BigInteger;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
	
		
		BigInteger fact =BigInteger.valueOf(n);
		for(int i=1; i<=n;i++) {
			
			
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}
