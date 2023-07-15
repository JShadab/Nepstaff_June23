package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Create a new list which only contains even numbers and double it.
		System.out.println("Input List: " + list);

		System.out.println("----------- With Java 8 features----------------");

		List<Integer> evenNums = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> 2 * x)
				.collect(Collectors.toList());

		System.out.println("Output List: " + evenNums);

		System.out.println("----------- Without Java 8 features----------------");

		List<Integer> evenNums2 = new ArrayList<>();
		for (int x : list) {
			if (x % 2 == 0) {
				int doubleIt = 2 * x;
				evenNums2.add(doubleIt);
			}
		}

		System.out.println("Output List: " + evenNums2);

	}

}
