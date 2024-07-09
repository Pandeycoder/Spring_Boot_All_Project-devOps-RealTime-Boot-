package array;

public class RemoveDup {

	public static void main(String[] args) {
		
		int arr[]= {10,10,20,20,30};
		removeDup(arr);
	}
	
	static void removeDup(int arr[])
	{
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		
		int res=1;
		for(int i=0;i<arr.length;i++)
		{
			if(temp[res-1]!=arr[i])
			{
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
			System.out.print(" "+arr[i]);
		}
		
		
	}
}

