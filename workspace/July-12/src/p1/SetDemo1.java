package p1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {

		Set fruits = new HashSet();

		System.out.println(fruits.size()); // 0
		System.out.println(fruits.isEmpty()); // true

		System.out.println("-----------------");

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple"); // duplicate element will not added
		fruits.add("Orange");
		fruits.add("Grapes");

		System.out.println(fruits.size()); // 4
		System.out.println(fruits.isEmpty()); // false
		System.out.println(fruits);
		
		System.out.println("=========== Set DON'T have INDEX==============");

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
