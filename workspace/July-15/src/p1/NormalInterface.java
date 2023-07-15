package p1;

public interface NormalInterface {

	// More than 1 abstract method
	void m1();
	void m2();

	default void m3() {
		System.out.println("Hello from m3()");
	}

	static void m4() {
		System.out.println("Hello from m4()");
	}

}
