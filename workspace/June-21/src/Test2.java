
public class Test2 {

	public static void main(String[] args) {

		System.out.println(10 / 0); // ArithmeticException

		System.out.println(10.0 / 0); // Infinity

		System.out.println(-10 / 0.0); // Infinity

		System.out.println(0.0 / 0.0); // NaN

	}

}
