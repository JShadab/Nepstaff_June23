package p2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {

		//Set fruits = new HashSet();
		List fruits = new ArrayList();

		System.out.println(fruits.size()); // 0
		System.out.println(fruits.isEmpty()); // true

		System.out.println("-----------------");

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple"); // It will add duplicate.
		fruits.add("Orange");
		fruits.add("Grapes");

		System.out.println(fruits.size()); // 5
		System.out.println(fruits.isEmpty()); // false
		System.out.println(fruits);
		
		System.out.println("===========use INDEX==============");
		
		System.out.println(fruits.get(0));// Apple
		System.out.println(fruits.get(4));// Grapes
		
		System.out.println("===========================");

		System.out.println("-----------------");

		System.out.println(fruits.contains("Orange")); // true
		System.out.println(fruits.contains("Guava")); // false

		System.out.println("-----------------");

		fruits.remove("Orange");

		System.out.println(fruits.contains("Orange")); // false
		System.out.println(fruits);

		System.out.println("-----------------");

		fruits.clear();

		System.out.println(fruits);
		System.out.println(fruits.isEmpty());

	}

}
