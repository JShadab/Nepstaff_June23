package p1;

/**
 * With Exception, with handling code
 **/
public class Test3 {

	public static void main(String[] args) {

		System.out.println("Main Before");

		foo();

		System.out.println("Main After");
	}

	private static void foo() {

		System.out.println("Foo Before");

		int a = 10;
		int b = 0;

		try {
			System.out.println("TRY Block");

			int c = a / b; // 100% chance for ArithmeticException
			
			System.out.println(c);

		} catch (Exception e) {
			System.out.println("CATCH Block");
		} finally {
			System.out.println("FINALLY Block");
		}

		System.out.println("Foo After");

	}

}
