package p1;

@FunctionalInterface
public interface MyInterface {

	// ONLY 1 abstract method
	void foo();

	default void m3() {
		System.out.println("Hello from m3()");
	}

	static void m4() {
		System.out.println("Hello from m4()");
	}

}
