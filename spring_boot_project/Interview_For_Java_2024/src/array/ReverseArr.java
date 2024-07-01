package array;

public class ReverseArr {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 11, 15, 9 };
        rev(arr);
	}

	private static void rev(int arr[]) {

		System.out.println("Array ....Rev");
		int low = 0, high = arr.length-1 ;
		while (low < high) {//0<5
			int temp = arr[low]; //t=10
			arr[low] = arr[high]; //a[0]=9
			arr[high] = temp;//arr[4]=10
			low++;//1
			high--;//3
		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
