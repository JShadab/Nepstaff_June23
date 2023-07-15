package p3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {

		Student s1 = new Student(101, "Ramesh");
		Student s2 = new Student(102, "Suresh");
		Student s3 = new Student(103, "Rupesh");
		Student s4 = new Student(104, "Kamlesh");

		Student[] arr = { s1, s2, s3, s4 };

		System.out.println("----------- With Java 8 features----------------");
		
		Arrays.stream(arr)
		.map(s -> s.getName())
		.forEach(s -> System.out.println(s));

		System.out.println("----------- Without Java 8 features----------------");

		for (int i = 0; i < arr.length; i++) {
			
			Student s = arr[i];			
			String name = s.getName();			
			System.out.println(name);
		}

	}

}
