package recursion;
public class RopeCuttingProblem {
	public static void main(String[] args) {
		
		System.out.println(ropeCutting(23,11,9,12));
		
	}
	
	private static int ropeCutting(int n,int a ,int b, int c)
	{
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int res=ropeCutting(n-a,a,b,c);
		int res1=ropeCutting(n-b,a,b,c);
		int res3=ropeCutting(n-c,a,b,c);
		
		int res4=Math.max(res, res1);
		
		int res5= Math.max(res4, res3);
		
		if(res5==-1)
			return -1;
		return res5+1;
	}

}
