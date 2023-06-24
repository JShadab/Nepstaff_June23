import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {

		String[] fruits = { "Mango", "Apple", "Orange", "Grapes" };

		System.out.println(fruits.length);// 4 | [0-3]

		System.out.println("-----------------------");

		for (int i = 0; i < fruits.length; i++) {

			System.out.println(fruits[i]);

		}

		System.out.println("-----------------------");

		System.out.println(Arrays.toString(fruits));

	}
}
