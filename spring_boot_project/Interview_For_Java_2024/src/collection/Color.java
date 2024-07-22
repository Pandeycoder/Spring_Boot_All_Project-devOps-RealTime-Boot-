package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Color implements ColorInterface {

	@Override
	public void color() {
		List<String> c = new ArrayList<>();
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Black");
		System.out.println(c);

		// -------------------

		System.out.println("\nFor loop normal...");
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}

		// ------------------

		System.out.println("\nFor each loop through...");
		for (String l : c) {
			System.out.println(l);
		}

		c.set(2, "yellow");// update
		System.out.println(c);

		c.add(0, "Pink");// specific position
		System.out.println(c);

		System.out.println(c.get(2));

		c.remove(2); // delete the element
		System.out.println(c);

		for (String s : c) {
			if (s.contains("Red")) // search the element
			{
				System.out.println("This is  " + s);
			}
		}

		Collections.sort(c);
		System.out.println(c);

		Collections.reverse(c);
		System.out.println(c);

		System.out.println("-----------");

		Collections.shuffle(c);
		System.out.println(c);

		// sum part I store data from List
		List<String> subList = c.subList(0, 2);
		System.out.println(subList);

		ArrayList<String> c3 = new ArrayList<String>();
		for (String e : c) {
			c3.add(subList.contains(e) ? "yes" : "No");

		}
		System.out.println(c3);

	}

	public static void main(String[] args) {

		new Color().color();
	}
}
