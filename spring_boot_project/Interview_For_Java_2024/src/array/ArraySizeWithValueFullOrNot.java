package array;

public class ArraySizeWithValueFullOrNot {

	public static void main(String[] args) {

		int arr[] = new int[5];
		arr[0] = 5;
		arr[1] = 3;
		int size = arr.length;
		checkSize(arr, 5, 2, size, 100);

		display(arr);

	}

	private static void display(int arr[]) {
		for (int arr1 : arr) {
			System.out.print(" " + arr1);
		}
	}

	private static void checkSize(int arr[], int pos, int currSize, int size, int value) {
		if (currSize == size) {
			System.out.println("Array is full. Size: " + size);
			return;
		}

		int index = pos - 1; // converting 1-based position to 0-based index
		if (index <= arr.length && index >= 0) {

			// Shift elements to the right
			for (int i = currSize - 1; i >= index; i--) {
				arr[i + 1] = arr[i];
			}

			// Insert the new value
			arr[index] = value;
			currSize++;
			System.out.println("New size after insertion: " + currSize);
		}

		else {
			System.out.println("Please Enter valid the size:-------try again ");
		}

	}

}
