package array;

public class DeleteInsert {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 42, 11, 23, 10 };
		
		int arr1[] = { 10, 20, 42, 11, 23, 10 };
		
		
		insertNum(arr1,arr.length,2,100);
		
		deleteNum(arr, arr.length, 20);

	}

	static void insertNum(int arr[],int size,int pos,int value)
	{
		
		if(size==pos)
		{
			System.out.println("Array size is full");
			return ;
		}
		
		int index=pos-1;
		for(int i=index;i<size-1;i++)
		{
			arr[i+1]=arr[i];
		}
		System.out.println();	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();

	}

	static void deleteNum(int arr[], int size, int value) {

		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				break;
			}
		}
		if (i == size) // 1== 5
		{
			System.out.println(size);
			return;
		}

		for (int j = i; j < size - 1; j++) {
			arr[j] = arr[j + 1];
			// a[1]=42 //a[2]=11
		}

		for (int j = 0; j < size - 1; j++) {
			System.out.print(" " + arr[j]);
		}

	}

}
