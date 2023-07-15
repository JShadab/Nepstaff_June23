package p2;

public class TestWithLambda {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		// Add
		Calculation addition = ( x,  y) -> 	 (x + y);
		

		int result1 = addition.opertion(a, b);
		System.out.println(result1);

		System.out.println("-------------------");
		// Sub
		Calculation subtraction = (x, y) -> x - y;
		int result2 = subtraction.opertion(a, b);
		System.out.println(result2);

		// Multiply
		System.out.println("-------------------");
		Calculation multiplication = (x, y) -> x * y;
		int result3 = multiplication.opertion(a, b);
		System.out.println(result3);

		// divide
		System.out.println("-------------------");
		Calculation division = (x, y) -> x / y;
		int result4 = division.opertion(a, b);
		System.out.println(result4);

	}

}
