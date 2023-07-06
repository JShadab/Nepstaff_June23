package p3;

public class B extends A {

	public B() {
		super();
		System.out.println("Hello From B");
	}

	public B(String guest) {
		this();
		System.out.println("Hello From B with " + guest);
	}

}
