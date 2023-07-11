package p2;

public class Sample4 {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("0");

		for (int i = 1; i <= 10; i++) {
			str.append(i);
		}
	
		// "012345678910"

		System.out.println(str); // "012345678910"

	}

}
