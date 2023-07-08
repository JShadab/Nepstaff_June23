package p1;

public class Employee implements Cloneable {

	private String name;
	private int id;
	private double salary;
	private String wife;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, String wife) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.wife = wife;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", wife=" + wife + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp2 = (Employee) obj;

		boolean x = this.id == emp2.id;
		boolean y = this.salary == emp2.salary;
		boolean z = this.name.equals(emp2.name);

		return x && y && z;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
