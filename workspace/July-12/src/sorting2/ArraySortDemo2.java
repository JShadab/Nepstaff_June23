package sorting2;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo2 {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Ramesh", 1234.5);
		Employee e2 = new Employee(103, "Suresh", 5567.5);
		Employee e3 = new Employee(104, "Mahesh", 2349.5);
		Employee e4 = new Employee(102, "Rupesh", 1134.5);

		Employee[] arr = { e1, e2, e3, e4 };

		System.out.println("Before : " + Arrays.toString(arr));

		System.out.println(" ----------- using ID ------------");

		Arrays.sort(arr, new IdComparator()); // will compare objects like this -> e1.compareTo(e2) and so on....

		System.out.println("After : " + Arrays.toString(arr));

		System.out.println(" ----------- using Name ------------");

		Arrays.sort(arr, new NameComparator());

		System.out.println("After : " + Arrays.toString(arr));

		System.out.println(" ----------- using Salary------------");

		Arrays.sort(arr);

		System.out.println("After : " + Arrays.toString(arr));
	}

}

class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getId() - e2.getId();
	}
}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}


