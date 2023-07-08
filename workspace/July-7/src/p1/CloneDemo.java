package p1;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp1 = new Employee(101, "Musa", 1234, "Abcd");
		
		Employee emp2 = new Employee(emp1.getId(), emp1.getName(), emp1.getSalary() );
		
		Employee emp3 =(Employee) emp1.clone();
		
		

//		Employee emp1 = new Employee();
//		emp1.setId(101);
//		emp1.setName("Ramesh");
//		emp1.setSalary(1234);
//
//		Employee emp2 = new Employee();
//		emp2.setId(emp1.getId());
//		emp2.setName(emp1.getName());
//		emp2.setSalary(emp1.getSalary());
//
		System.out.println("Emp1: " + emp1);
		System.out.println("Emp2: " + emp2);
		System.out.println("Emp3: " + emp3);
	}

}
