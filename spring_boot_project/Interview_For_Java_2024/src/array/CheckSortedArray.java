package array;

public class CheckSortedArray {
	public static void main(String[] args) {
		int arr[] = { 10, 10, 13, 15, 19 };

		System.out.println(checkSort(arr));
		System.out.println(checkSort1(arr));
	}

	private static boolean checkSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) { 
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkSort1(int arr[]) {

		

		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<arr[i-1] ) { // 10 < 10 // 9< 13 //13<15

				return false;
			}
			
		}
		return true;

	}

}
