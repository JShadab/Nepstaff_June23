package sorting2;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {

		// Using SALARY
		if (this.salary > e.getSalary()) {
			return 1;
		} else if (this.salary < e.getSalary()) {
			return -1;
		} else {
			return 0;
		}

		// using ID
		// return this.id - e.id;
	}

}
