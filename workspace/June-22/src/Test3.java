
public class Test3 {

	public static void main(String[] args) {

		int x = 15;

		boolean b1 = (6 > x) & (x < 20); // false & true => false
		
		boolean b2 = (6 > x) && (x < 20); // false && (Not Evaluated) => false
		
		System.out.println(b1);
		System.out.println(b2);

	}

}
