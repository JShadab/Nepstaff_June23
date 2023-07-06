package p3;

public class Test {

	public static void main(String[] args) {

		SalaryCalculator calculator = new SalaryCalculator();

		double total = calculator.calcSalary(-100);
		System.out.println("$" + total);

	}

}
