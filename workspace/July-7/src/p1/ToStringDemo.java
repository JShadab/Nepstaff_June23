package p1;

public class ToStringDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Ramesh");
		emp1.setSalary(1234);

		System.out.println(emp1);

		System.out.println("---------------------------");

		Employee emp2 = new Employee(102, "Suresh", 2346.0);

		System.out.println(emp2);

	}

}
