package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {

		Set<String> fruits = new HashSet<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Orange");
		fruits.add("Grapes");

		System.out.println(fruits);

		System.out.println("----- using toArray()[Not recommended] -------------");

		String[] arr = fruits.toArray(new String[] {});

		for (int i = 0; i < arr.length; i++) {
			String element = arr[i];
			System.out.println(element);
		}

		// We cannot use index for loop
		/*
		 * System.out.println("----- using index for loop -------------");
		 * 
		 * for (int i = 0; i < fruits.size(); i++) { String element = fruits.get(i);
		 * System.out.println(element); }
		 */

		System.out.println("----- using  forEach loop -------------");

		for (String element : fruits) {
			System.out.println(element);
		}

		System.out.println("----- using  Iteraror -------------");

		Iterator<String> it = fruits.iterator();

		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

		System.out.println("----- using  Java8 forEach method -------------");

		// fruits.forEach(f -> System.out.println(f));
		fruits.forEach(System.out::println);

	}

}
