import p0.A;
import p0.B;
import p0.C;
import p1.Child_C;

public class Test {
	
	public static void main(String[] args) {
		A v1 = new A();
		
		B v2 = new B();
		
		//C v3 = new C(); // Error
		
		Child_C v3 = new Child_C();
		v3.m5();
		v3.m6();
		
	}

}
