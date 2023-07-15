package p3;

public class Student {

	private String name;
	private int rollNum;

	public Student(int rollNum, String name) {
		super();
		this.name = name;
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + "]";
	}

}
