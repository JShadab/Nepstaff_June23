package p2;

public class Y extends X {

	int j = 15;
	float i = 2.3F; // member variable

	void foo() {
		String i = "Java"; // local variable

		System.out.println(i);// Java
		System.out.println(this.i);// 2.3
		System.out.println(super.i);// 10

	}

}
