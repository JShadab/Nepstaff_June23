package p1;

/**
 * With Exception, without handling code
 **/
public class Test2 {

	public static void main(String[] args) {

		System.out.println("Main Before");

		foo();

		System.out.println("Main After");
	}

	private static void foo() {

		System.out.println("Foo Before");

		int a = 10;
		int b = 0;

		int c = a / b;  // 100% chance for ArithmeticException
		System.out.println(c); // 3

		System.out.println("Foo After");

	}

}
