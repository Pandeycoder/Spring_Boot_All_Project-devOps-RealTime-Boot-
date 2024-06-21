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

	private static void largest(int ar[]) {
		int smallest = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < smallest) {
				smallest = ar[i];
			}
		}
		System.out.println(smallest);

	}

	private static void smallest(int arr[]) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

	}

	private static void second(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("second : " + arr[1]);
		for (int arr1 : arr) {
			System.out.println(arr1);
		}

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
