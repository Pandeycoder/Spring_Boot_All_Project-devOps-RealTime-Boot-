package array;

public class MaxSubArr {
	public static void main(String[] args) {
	
		int arr[]= {1,-2,3,-1,2};
		subArraySum(arr);
	}
	
	static void subArraySum(int arr[])
	{
		int res=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int curr=0;
			for(int j=i;j<arr.length;j++)
			{
				curr=curr+arr[j];
				res=Math.max(curr, res);
				
			}
		}
		System.out.println(res);
	}

}
