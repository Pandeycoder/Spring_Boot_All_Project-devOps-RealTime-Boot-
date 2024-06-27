package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class LargestSmallest {
	public static void main(String[] args) {

		int arr[] = { 45, 11, 13, 13, 12, 10, 9, 100, 56, 10 };
		largest(arr);
		smallest(arr);
		System.out.println("-----");
		second(arr);
		occur(arr);

	}

	private static int largest(int ar[]) {
		int largest=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>largest)
			{
				largest=ar[i];
			}
		}
		System.out.println("Largest No :"+largest);
		return largest;
	}

	private static void smallest(int arr[]) {
		
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("smallest No :"+smallest);
	}

	private static void second(int arr[]) {
		
		int largest=largest(arr);//100
		System.out.println("largest "+largest);
		
		int res=-1;
		
		for(int i=0;i<arr.length;i++)
		{
		  if(arr[i]!=largest) 
		  {
			  if(res==-1)
			  {
				  res=i;
			  }
			  else if(arr[i]>arr[res])
			  {
				  res=i;
			  }
				  
		  }
			
		}
		System.out.println("Second " +arr[res]);
		
	}

	private static void occur(int arr[]) {
		ArrayList<Integer> l = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.print(" " + key + "  ");
			System.out.println(map.get(key));
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			l.add(count);

		}
	}

}
