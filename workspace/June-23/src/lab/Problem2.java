package lab;

/**
 * Write a Java program to sum values of an array.
 */
public class Problem2 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		System.out.println("SUM is : " + sum);

		calArea(10);
		calArea(4);
		calArea(98);
		calArea(66);

	}

	static void calArea(int radius) {
		//UPDATED code to find the area of a circle
	}

}


