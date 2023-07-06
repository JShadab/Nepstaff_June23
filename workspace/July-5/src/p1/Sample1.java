package p1;

public class Sample1 {

	public static void main(String[] args) {
		int i = 10;
		i = 15;

		System.out.println(i);

		final int j = 10;
		// j = 20; // Error

		System.out.println(j);
	}

}
