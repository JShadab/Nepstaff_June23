package p1;

public class Student {

	String name;
	int rollNo;
	boolean isEnrolled;

	public Student() {
		this.name = "Musa";
		this.rollNo = 4321;
		this.isEnrolled = false;
	}

	public Student(String name, int rollNo, boolean isEnrolled) {
		this.name = name;
		this.rollNo = rollNo;
		this.isEnrolled = isEnrolled;
	}

	public void displayInfo() {

		System.out.println("[name=" + name + ", rollNo=" + rollNo + ", isEnrolled=" + isEnrolled + "]");

	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.displayInfo();

//		s1.name = "Ramesh";
//		s1.rollNo = 1234;
//		s1.isEnrolled = true;
//
//		s1.displayInfo();

		System.out.println("----------------------------");

		Student s2 = new Student("Riya", 9988, true);
		s2.displayInfo();

	}

}
