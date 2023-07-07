package p1;

public class EqualsDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Ramesh");
		emp1.setSalary(1234);

		Employee emp2 = new Employee(101, "Ramesh", 1234);

		boolean b = emp1.equals(emp2);

		System.out.println(b);

	}

}
