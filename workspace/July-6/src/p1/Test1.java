package p1;

/**
 * Without Exception, without handling code
 **/
public class Test1 {

	public static void main(String[] args) {

		System.out.println("Main Before");

		foo();

		System.out.println("Main After");
	}

	private static void foo() {

		System.out.println("Foo Before");

		int a = 10;
		int b = 3;

		int c = a / b;
		System.out.println(c); // 3

		System.out.println("Foo After");

	}

}
