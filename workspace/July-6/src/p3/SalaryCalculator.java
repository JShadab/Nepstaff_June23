package p3;

public class SalaryCalculator {

	public double calcSalary(int basic) {

		if (basic <= 0) {

			RuntimeException exception = new RuntimeException(
					"How dare you!!! basic salary cannot be ZERO or NEGATIVE");
			throw exception;
		}

//		if(basic <=0)
//		{
//			System.out.println("Sorry!!! basic salary cannot be ZERO or NEGATIVE");
//			return 0;
//		}

		double total = 2 * basic + 50;
		return total;
	}

}
