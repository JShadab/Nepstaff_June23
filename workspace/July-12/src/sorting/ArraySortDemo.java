package sorting;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {

		Integer[] arr = { 62, 85, 31, 78, 22, 59, 35 };

		System.out.println("Before : " + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("After : " + Arrays.toString(arr));
	}

}

