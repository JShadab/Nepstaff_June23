package p1;

public class UseCase2_1 {

	public static void main(String[] args) {

		String str = "101.5";

	//	int a = Integer.parseInt(str); // 0-9
		
		float a = Float.parseFloat(str); // 0-9 with at most 1 decimal point
		System.out.println(a);
		System.out.println("-----------------------");
		
		String str2 = "abc";
		int b = Integer.parseInt(str2);
		System.out.println(b);

	}

}
