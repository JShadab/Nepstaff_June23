package p2;

import p1.A;

/**
 * 4. From the sub-class with in the different package.
 **/
public class D extends A{

	void m4() {

		System.out.println(a); // OK
		System.out.println(b); // OK (through Inheritance)
		System.out.println(c); // ERROR
		System.out.println(d); // ERROR
	}

}
