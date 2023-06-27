
public class ForEachLoopDemo {

	public static void main(String[] args) {

		int[] arr = { 10, 40, 30, 50, 20 };

		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			System.out.println(x);
		}
		System.out.println("-----------------");
	
		for (int x : arr) {
			System.out.println(x);
		}

		System.out.println("Done");
	}

}
