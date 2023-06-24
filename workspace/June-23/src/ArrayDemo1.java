
public class ArrayDemo1 {
	public static void main(String[] args) {

		// <type>[] <var> = new <type>[<size>];

		int[] arr = new int[5];

		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 11;
		
		arr[5] = 1000; // Invalid Index | bounds [0-4]

		System.out.println(arr.length);

		int[] brr = { 3, 5, 7, 9, 11 };
		System.out.println(brr.length);

		String[] fruits = { "Mango", "Apple", "Orange", "101" };

	}
}
