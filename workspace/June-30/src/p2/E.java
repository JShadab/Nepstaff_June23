package p2;

import p1.A;

/**
 * 5. From the another class with in the different package.
 **/
public class E {

	void m5() {
		A obj = new A();

		System.out.println(obj.a); // OK
		System.out.println(obj.b); // ERROR
		System.out.println(obj.c); // ERROR
		System.out.println(obj.d); // ERROR
	}

}
