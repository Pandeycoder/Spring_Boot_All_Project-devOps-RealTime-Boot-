package collection;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		Color();
	}

	static void Color() {
		HashMap<Integer, String> col = new HashMap<>();

		col.put(1, "Red");
		col.put(2, "Blue");
		col.put(3, "Green");
		col.put(4, "Yellow");
		col.put(6, "Black");
		System.out.print(col.keySet() + " " + col.values() + "\n");

		for (Map.Entry x : col.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		System.out.println(col.size());

		HashMap<Integer, String> copy = new HashMap<>();

		copy.put(7, "Orange");
		copy.put(8, "Violet");//

		copy.putAll(col);

		System.err.print(copy.keySet() + " " + copy.values() + "\n");

		// clone
		HashMap<Integer, String> colon1 = new HashMap<>();

		colon1 = (HashMap) copy.clone();
		System.err.println(colon1);

		copy.clear();
		System.err.print(copy.keySet() + " " + copy.values() + "\n");

		boolean res = copy.isEmpty();
		System.out.println(res);

	}

}
