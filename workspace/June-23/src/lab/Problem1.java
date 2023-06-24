package lab;

public class Problem1 {

	public static void main(String[] args) {

		int[] nums = { 76, 48, 34, 94, 37, 29, 53 };

		int key = 99;

		boolean isFound = false;

		for (int i = 0; i < nums.length; i++) {

			if (key == nums[i]) {
				isFound = true;
				System.out.println(key + " is found at index " + i);
				break;
			}

		}

		if (!isFound) {
			System.out.println("There is no value like " + key + " in the array");
		}

	}

}
