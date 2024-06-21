package array;
import java.util.ArrayList;
public class SearchInArray {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 45, 23, 12, 100 };

		System.out.println("Index= " + searchArr(arr, 12));

	}
//time complexity is BigOf n
	private static int searchArr(int arr[], int search) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		return -1;
	}
}
