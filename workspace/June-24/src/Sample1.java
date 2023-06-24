
public class Sample1 {

	public static void main(String[] args) {

		Sample1.sayHello();
		Sample1.sayHello();
		Sample1.sayHello();

		System.out.println("--------------------------");

		Sample1 obj = new Sample1();

		int x = obj.sum(5, 7);
		System.out.println(x);

	}

	// static method
	static void sayHello() {
		System.out.println("Hello");
	}

	// instance method
	int sum(int a, int b) {
		int c = a + b;
		return c;
	}

}
