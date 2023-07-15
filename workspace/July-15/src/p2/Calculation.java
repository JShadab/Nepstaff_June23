package p2;

@FunctionalInterface
public interface Calculation {

	int opertion(int x, int y);

	default void display() {
	}

}
