package p2;

public class Sample3 {

	public static void main(String[] args) {

		String str = "0";

		for (int i = 1; i <= 10; i++) {
			str = str + i;
		}
		// "0" +1
		// "01" + 2
		// "012" + 3
		// "0123"
		// "01234"
		// "012345"
		// "0123456"
		// "01234567"
		// "012345678"
		// "0123456789"
		// "012345678910"
		
		System.out.println(str); // "012345678910"

	}

}
