package p1;

public class HashCodeDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Ramesh");
		emp1.setSalary(1234);
		
		
		int h1 = emp1.hashCode();		
		System.out.println(h1);

		
		System.out.println("---------------------------");
		
		
		//Employee emp2 = new Employee(102, "Suresh", 2346.0);
		Employee emp2 = new Employee(101, "Ramesh", 1234);
		int h2 = emp2.hashCode();
		System.out.println(h2);
		

	}

}
