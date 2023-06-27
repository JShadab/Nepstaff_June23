
public class Test {

	public static void main(String[] args) {

		Calculator obj = new Calculator();

		int result1 = obj.sum(12, 7);
		System.out.println(result1);

		int result2 = obj.sum(5, 10, 20);
		System.out.println(result2);
		
		int result3 = obj.sum(5);
		System.out.println(result3);

	}

}
