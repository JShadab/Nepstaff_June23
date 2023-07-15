package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(7, 8, 4, 9, 3, 4, 1, 5);

		System.out.println("Before : " + list);

		Collections.sort(list);

		System.out.println("After : " + list);
	}

}
