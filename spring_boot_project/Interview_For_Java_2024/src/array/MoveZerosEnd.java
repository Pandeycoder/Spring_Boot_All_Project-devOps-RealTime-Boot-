package array;

public class MoveZerosEnd {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 0, 0, 8, 0, 9, 0 };

		moveZero(arr);
	}

	private static void moveZero(int arr[]) {
		// {10,5,0,0,8,0,9,0}
												
		// 10,5,8,9,0,0,0,0
											
		// if(arr[i]==0)
												
		// temp=arr[i];
												
		// arr[i]=arr[end]
												
		// arr[end]=temp;

		int end = arr.length - 1;
		int count=0;
		for (int i = 0; i < arr.length; i++) {

			
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
