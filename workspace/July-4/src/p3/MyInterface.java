package p3;

//Before Java8
public interface MyInterface {

	int x = 10; // => public static final int x =10;
	public static final int y = 20;// constant

	void m1(); // => public abstract void m1();

	public abstract void m2();

	default void foo() {
	}

	static void boo() {
	}

}
