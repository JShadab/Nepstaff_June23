package zoo;

public class Crow extends Animal implements Flyable{

	@Override
	public void eat() {
		System.out.println("Crow is eating");
		
	}
	
	@Override
	public void fly() {
		System.out.println("Crow is Flying");
	}

}
