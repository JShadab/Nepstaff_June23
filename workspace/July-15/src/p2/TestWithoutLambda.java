package p2;

public class TestWithoutLambda {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		// Add
		Calculation addition = new Addition();
		int result1 = addition.opertion(a, b);
		System.out.println(result1);

		System.out.println("-------------------");
		// Sub
		Calculation subtraction = new Subtraction();
		int result2 = subtraction.opertion(a, b);
		System.out.println(result2);

		// Multiply
		System.out.println("-------------------");
		Calculation multiplication = new Multiplication();
		int result3 = multiplication.opertion(a, b);
		System.out.println(result3);

		// divide
		System.out.println("-------------------");
		Calculation division = new Division();
		int result4 = division.opertion(a, b);
		System.out.println(result4);

	}

	static class Addition implements Calculation {
		@Override
		public int opertion(int x, int y) {
			return x + y;
		}
	}

	static class Subtraction implements Calculation {
		@Override
		public int opertion(int x, int y) {
			return x - y;
		}
	}

	static class Multiplication implements Calculation {
		@Override
		public int opertion(int x, int y) {
			return x * y;
		}
	}

	static class Division implements Calculation {
		@Override
		public int opertion(int x, int y) {
			return x / y;
		}
	}
}
