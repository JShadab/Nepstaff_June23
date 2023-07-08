package p1;

public class Sample2 {

	public static void main(String[] args) {

		// Using literal
		String s1 = "Java";
		String s2 = "Java";

		boolean b1 = s1 == s2; // Address(reference) -> true
		boolean b2 = s1.equals(s2); // Content equality > true

		System.out.println("s1 == s2 :" + b1);
		System.out.println("s1.equals(s2) :" + b2);

		System.out.println("----------------------------");

		// using new operator
		String s3 = new String("Spring");
		String s4 = new String("Spring");

		boolean b3 = s3 == s4;  // Address(reference) -> false
		boolean b4 = s3.equals(s4); // Content equality > true

		System.out.println("s3 == s4 :" + b3);
		System.out.println("s3.equals(s4) :" + b4);
	}

}
