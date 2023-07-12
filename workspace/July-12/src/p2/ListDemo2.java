package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

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

		// We can use index for loop

		System.out.println("----- using index for loop -------------");

		for (int i = 0; i < fruits.size(); i++) {
			String element = fruits.get(i);
			System.out.println(element);
		}

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
